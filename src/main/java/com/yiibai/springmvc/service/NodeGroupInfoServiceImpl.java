package com.yiibai.springmvc.service;

import com.yiibai.springmvc.dao.NodeGroupInfoDao;
import com.yiibai.springmvc.model.NodeGroupInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Service("nodeGroupInfoService")
@Transactional
public class NodeGroupInfoServiceImpl implements NodeGroupInfoService {

    @Autowired
    NodeGroupInfoDao nodeGroupInfoDao;

    public NodeGroupInfoEntity findById(long id) {
        return nodeGroupInfoDao.findById(id);
    }

    public NodeGroupInfoEntity findByNodeGroupName(String nodeGroupName) {
        return nodeGroupInfoDao.findByNodeGroupName(nodeGroupName);
    }

    public void save(NodeGroupInfoEntity nodeGroupInfoEntity) {
        nodeGroupInfoDao.save(nodeGroupInfoEntity);
    }

    public void deleteById(long nodeGroupId) {
        nodeGroupInfoDao.deleteById(nodeGroupId);
    }

    public List<NodeGroupInfoEntity> findAllNodeGroupInfos() {
        return nodeGroupInfoDao.findAllNodeGroupInfos();
    }

    public void deleteByNodeGroupName(String nodeGroupName) {
        nodeGroupInfoDao.deleteByNodeGroupName(nodeGroupName);
    }
}
