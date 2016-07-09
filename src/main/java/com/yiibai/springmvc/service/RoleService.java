package com.yiibai.springmvc.service;

import com.yiibai.springmvc.model.RoleEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/6.
 */
public interface RoleService {

    RoleEntity findById(long id);

    RoleEntity findByRoleName(String roleName);

    void saveRole(RoleEntity roleEntity);

    void deleteUserByRoleName(String roleName);

    List<RoleEntity> findAllRoles();

    boolean isRoleUnique(Long id, String roleName);

}
