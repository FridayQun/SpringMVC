package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.ChannelGroupEntity;
import com.yiibai.springmvc.model.RoleEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
public interface ChannelGroupDao {
    ChannelGroupEntity findById(long id);

    void save(ChannelGroupEntity channelGroupEntity);

    void deleteById(long channelGroupId);

    List<ChannelGroupEntity> findAllChannelGroups();

}
