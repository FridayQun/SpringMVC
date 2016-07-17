package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.RoleEntity;
import com.yiibai.springmvc.model.UsersEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/10.
 */
public interface UserDao{
    UsersEntity findById(long id);

    UsersEntity findByUsersName(String usersName);

    void save(UsersEntity usersEntity);

    void deleteById(long roleId);

    List<UsersEntity > findAllUsers();

    void deleteByUsersName(String usersName);

}
