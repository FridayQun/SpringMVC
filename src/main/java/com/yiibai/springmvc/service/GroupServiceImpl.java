package com.yiibai.springmvc.service;

import com.yiibai.springmvc.dao.UserGroupDao;
import com.yiibai.springmvc.model.UserGroupEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2016/7/13.
 */
@Service("groupService")
@Transactional
public class GroupServiceImpl implements GroupService {

    @Autowired
    UserGroupDao userGroupDao;

    public UserGroupEntity findById(Long id) {
        return userGroupDao.findById(String.valueOf(id));
    }

    public void save(UserGroupEntity groupEntity) {
        userGroupDao.save(groupEntity);
    }

    public List<UserGroupEntity> findAllGroups() {
        return userGroupDao.findAllGroups();
    }
}
