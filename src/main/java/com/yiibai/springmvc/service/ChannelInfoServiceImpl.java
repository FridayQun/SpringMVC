package com.yiibai.springmvc.service;

import com.yiibai.springmvc.dao.ChannelInfoDao;
import com.yiibai.springmvc.model.ChannelInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Service("channelInfoService")
@Transactional
public class ChannelInfoServiceImpl implements ChannelInfoService {

    @Autowired
    ChannelInfoDao channelInfoDao;

    public ChannelInfoEntity findById(long id) {
        return channelInfoDao.findById(id);
    }

    public void save(ChannelInfoEntity channelInfoEntity) {
        channelInfoDao.save(channelInfoEntity);
    }

    public void deleteById(long id) {
        channelInfoDao.deleteById(id);
    }

    public List<ChannelInfoEntity> findAllChannelInfos() {
        return channelInfoDao.findAllChannelInfos();
    }
}
