package com.yiibai.springmvc.service;

import com.yiibai.springmvc.dao.NodeInfoDao;
import com.yiibai.springmvc.model.NodeInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Service("nodeInfoService")
@Transactional
public class NodeInfoServiceImpl implements NodeInfoService {

    @Autowired
    NodeInfoDao nodeInfoDao;

    public NodeInfoEntity findById(long nodeId) {
        return nodeInfoDao.findById(nodeId);
    }

    public NodeInfoEntity findByNodeName(String nodeName) {
        return nodeInfoDao.findByNodeName(nodeName);
    }

    public void save(NodeInfoEntity nodeInfoEntity) {
        nodeInfoDao.save(nodeInfoEntity);
    }

    public void deleteById(long nodeId) {
        nodeInfoDao.deleteById(nodeId);
    }

    public List<NodeInfoEntity> findAllNodeInfos() {
        return nodeInfoDao.findAllNodeInfos();
    }

    public void deleteByNodeName(String nodeName) {
        nodeInfoDao.deleteByNodeName(nodeName);
    }
}
