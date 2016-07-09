package com.yiibai.springmvc.service;

import com.yiibai.springmvc.dao.RoleDao;
import com.yiibai.springmvc.model.RoleEntity;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2016/7/6.
 */

@Service("roleService")
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao dao;

    public RoleEntity findById(long id) {
        return dao.findById(id);
    }

    public RoleEntity findByRoleName(String roleName) {
        RoleEntity roleEntity = dao.findByRoleName(roleName);
        return roleEntity;
    }

    public void saveRole(RoleEntity roleEntity) {
        dao.save(roleEntity);
    }

    public void deleteUserByRoleName(String roleName) {
        dao.deleteByroleName(roleName);
    }

    public List<RoleEntity> findAllRoles() {
        return dao.findAllRoles();
    }

    public boolean isRoleUnique(Long id, String roleName) {
        RoleEntity roleEntity = findByRoleName(roleName);
        return ( roleEntity == null || ((id != null) && (roleEntity.getRoleId() == id)));
    }
}
