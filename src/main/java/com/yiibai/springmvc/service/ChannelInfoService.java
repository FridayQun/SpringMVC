package com.yiibai.springmvc.service;

import com.yiibai.springmvc.model.ChannelInfoEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
public interface ChannelInfoService {
    ChannelInfoEntity findById(long id);

    void save(ChannelInfoEntity channelInfoEntity);

    void deleteById(long id);

    List<ChannelInfoEntity> findAllChannelInfos();

}
