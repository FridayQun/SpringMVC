package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.NodeInfoEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
public interface NodeInfoDao {
    NodeInfoEntity findById(long nodeId);

    NodeInfoEntity findByNodeName(String nodeName);

    void save(NodeInfoEntity nodeInfoEntity);

    void deleteById(long nodeId);

    List<NodeInfoEntity> findAllNodeInfos();

    void deleteByNodeName(String nodeName);
}
