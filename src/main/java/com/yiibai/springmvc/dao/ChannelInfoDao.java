package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.ChannelGroupEntity;
import com.yiibai.springmvc.model.ChannelInfoEntity;
import com.yiibai.springmvc.model.RoleEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
public interface ChannelInfoDao {
    ChannelInfoEntity findById(long id);

    void save(ChannelInfoEntity channelInfoEntity);

    void deleteById(long id);

    List<ChannelInfoEntity> findAllChannelInfos();

}
