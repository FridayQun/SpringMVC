package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.UserGroupEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/13.
 */
public interface UserGroupDao {
    UserGroupEntity findById(String id);
    void save(UserGroupEntity groupEntity);
    List<UserGroupEntity> findAllGroups();
}
