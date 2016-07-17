package com.yiibai.springmvc.service;

import com.yiibai.springmvc.dao.AbstractDao;
import com.yiibai.springmvc.dao.ChannelGroupDao;
import com.yiibai.springmvc.model.ChannelGroupEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Service("channelGroupService")
@Transactional
public class ChannelGroupServiceImpl implements ChannelGroupService {
    @Autowired
    ChannelGroupDao channelGroupDao;

    public ChannelGroupEntity findById(long id) {
        return channelGroupDao.findById(id);
    }

    public void save(ChannelGroupEntity channelGroupEntity) {
        channelGroupDao.save(channelGroupEntity);
    }

    public void deleteById(long channelGroupId) {
        channelGroupDao.deleteById(channelGroupId);
    }

    public List<ChannelGroupEntity> findAllChannelGroups() {
        return channelGroupDao.findAllChannelGroups();
    }

}
