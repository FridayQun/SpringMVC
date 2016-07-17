package com.yiibai.springmvc.service;

import com.yiibai.springmvc.dao.RoleDao;
import com.yiibai.springmvc.dao.UserDao;
import com.yiibai.springmvc.model.RoleEntity;
import com.yiibai.springmvc.model.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2016/7/13.
 */
@Service("usersService")
@Transactional
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UserDao dao;

    public UsersEntity findById(long id) {
        return dao.findById(id);
    }

    public UsersEntity findByUsersName(String usersName) {
        return dao.findByUsersName(usersName);
    }

    public void saveUsers(UsersEntity usersEntity) {
        dao.save(usersEntity);
    }

    public void deleteUserByUsersName(String usersName) {
        dao.deleteByUsersName(usersName);
    }

    public List<UsersEntity> findAllUsers() {
        return dao.findAllUsers();
    }

    public boolean isUsersUnique(Long id, String usersName) {
        UsersEntity usersEntity = findByUsersName(usersName);
        return ( usersEntity == null || ((id != null) && (usersEntity.getUserId() == id)));
    }
}
