package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.RoleEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/6.
 */
public interface RoleDao {

    RoleEntity findById(long id);

    RoleEntity findByRoleName(String roleName);

    void save(RoleEntity roleEntity);

    void deleteById(long roleId);

    List<RoleEntity> findAllRoles();

    void deleteByroleName(String roleName);

}
