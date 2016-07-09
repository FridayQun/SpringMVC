package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.RoleEntity;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2016/7/6.
 */

@Repository("roleDao")
public class RoleDaoImpl extends AbstractDao<Long, RoleEntity> implements RoleDao {

    public RoleEntity findById(long id) {

        RoleEntity roleEntity = getByKey(id);
        return roleEntity;
    }

    public RoleEntity findByRoleName(String roleName) {

        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("roleName", roleName));
        RoleEntity roleEntity = (RoleEntity) criteria.uniqueResult();
        return roleEntity;

    }

    public void save(RoleEntity roleEntity) {

        //查询一下名字有没有存储了
        persist(roleEntity);

    }

    public void deleteById(long roleId) {

        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("roleId", roleId));
        RoleEntity roleEntity = (RoleEntity) criteria.uniqueResult();
        delete(roleEntity);

    }

    public List<RoleEntity> findAllRoles() {

        Criteria criteria = createEntityCriteria().addOrder(Order.asc("roleId"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//to avoid duplicates.
        List<RoleEntity> roleEntities = (List<RoleEntity>) criteria.list();
        return roleEntities;

    }

    public void deleteByroleName(String roleName) {

        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("roleName", roleName));
        RoleEntity roleEntity = (RoleEntity) criteria.uniqueResult();
        delete(roleEntity);

    }

}

