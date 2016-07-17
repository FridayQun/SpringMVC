package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.NodeGroupInfoEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
public interface NodeGroupInfoDao {
    NodeGroupInfoEntity findById(long id);

    NodeGroupInfoEntity findByNodeGroupName(String nodeGroupName);

    void save(NodeGroupInfoEntity nodeGroupInfoEntity);

    void deleteById(long nodeGroupId);

    List<NodeGroupInfoEntity> findAllNodeGroupInfos();

    void deleteByNodeGroupName(String nodeGroupName);
}
