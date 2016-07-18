package com.yiibai.springmvc.service;

import java.util.List;

/**
 * Created by lenovo on 2016/7/18.
 */
public interface WholeInterface {

    public <T> T findById(long id);

    public <T> void save(T channelGroupEntity);

    void deleteById(long id);

    public <T> List<T> findAllChannelGroups();

}
