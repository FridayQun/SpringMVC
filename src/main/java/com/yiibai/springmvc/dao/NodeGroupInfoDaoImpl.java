package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.NodeGroupInfoEntity;
import com.yiibai.springmvc.model.RoleEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Repository("nodeGroupInfoDao")
public class NodeGroupInfoDaoImpl extends AbstractDao<Long, NodeGroupInfoEntity> implements NodeGroupInfoDao {

    public NodeGroupInfoEntity findById(long id) {
        return getByKey(id);
    }

    public NodeGroupInfoEntity findByNodeGroupName(String nodeGroupName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("nodeGroupName", nodeGroupName));
        NodeGroupInfoEntity nodeGroupInfoEntity = (NodeGroupInfoEntity) criteria.uniqueResult();
        return nodeGroupInfoEntity;
    }

    public void save(NodeGroupInfoEntity nodeGroupInfoEntity) {
        persist(nodeGroupInfoEntity);
    }

    public void deleteById(long nodeGroupId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("nodeGroupId", nodeGroupId));
        NodeGroupInfoEntity nodeGroupInfoEntity = (NodeGroupInfoEntity) criteria.uniqueResult();
        delete(nodeGroupInfoEntity);
    }

    public List<NodeGroupInfoEntity> findAllNodeGroupInfos() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("nodeGroupId"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//to avoid duplicates.
        List<NodeGroupInfoEntity> nodeGroupInfoEntity = (List<NodeGroupInfoEntity>) criteria.list();
        return nodeGroupInfoEntity;
    }

    public void deleteByNodeGroupName(String nodeGroupName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("nodeGroupName", nodeGroupName));
        NodeGroupInfoEntity nodeGroupInfoEntity = (NodeGroupInfoEntity) criteria.uniqueResult();
        delete(nodeGroupInfoEntity);
    }
}
