package com.yiibai.springmvc.service;

import com.yiibai.springmvc.model.ChannelGroupEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
public interface ChannelGroupService {
    ChannelGroupEntity findById(long id);

    void save(ChannelGroupEntity channelGroupEntity);

    void deleteById(long channelGroupId);

    List<ChannelGroupEntity> findAllChannelGroups();

}
