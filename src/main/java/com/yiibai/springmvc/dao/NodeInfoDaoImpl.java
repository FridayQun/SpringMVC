package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.NodeInfoEntity;
import com.yiibai.springmvc.model.RoleEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Repository("nodeInfoDao")
public class NodeInfoDaoImpl extends AbstractDao<Long, NodeInfoEntity> implements NodeInfoDao {

    public NodeInfoEntity findById(long nodeId) {
        return getByKey(nodeId);
    }

    public NodeInfoEntity findByNodeName(String nodeName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("nodeName", nodeName));
        NodeInfoEntity nodeInfoEntity = (NodeInfoEntity) criteria.uniqueResult();
        return nodeInfoEntity;
    }

    public void save(NodeInfoEntity nodeInfoEntity) {
        persist(nodeInfoEntity);
    }

    public void deleteById(long nodeId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("nodeId", nodeId));
        NodeInfoEntity nodeInfoEntity = (NodeInfoEntity) criteria.uniqueResult();
        delete(nodeInfoEntity);
    }

    public List<NodeInfoEntity> findAllNodeInfos() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("nodeId"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//to avoid duplicates.
        List<NodeInfoEntity> nodeInfoEntity = (List<NodeInfoEntity>) criteria.list();
        return nodeInfoEntity;
    }

    public void deleteByNodeName(String nodeName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("nodeName", nodeName));
        NodeInfoEntity nodeInfoEntity = (NodeInfoEntity) criteria.uniqueResult();
        delete(nodeInfoEntity);
    }
}
