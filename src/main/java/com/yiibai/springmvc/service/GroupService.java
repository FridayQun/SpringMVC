package com.yiibai.springmvc.service;

import com.yiibai.springmvc.model.UserGroupEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/13.
 */
public interface GroupService {
    UserGroupEntity findById(Long id);
    void save(UserGroupEntity groupEntity);
    List<UserGroupEntity> findAllGroups();
}
