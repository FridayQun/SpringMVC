package com.yiibai.springmvc.service;

import com.yiibai.springmvc.model.RoleEntity;
import com.yiibai.springmvc.model.UsersEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/13.
 */
public interface UsersService {
    UsersEntity findById(long id);

    UsersEntity findByUsersName(String usersName);

    void saveUsers(UsersEntity usersEntity);

    void deleteUserByUsersName(String usersName);

    List<UsersEntity > findAllUsers();

    boolean isUsersUnique(Long id, String usersName);

}
