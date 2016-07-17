package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.RoleEntity;
import com.yiibai.springmvc.model.UsersEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2016/7/10.
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Long, UsersEntity> implements UserDao {

    public UsersEntity findById(long id) {
        return getByKey(id);
    }

    public UsersEntity findByUsersName(String usersName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("userName", usersName));
        UsersEntity usersEntity = (UsersEntity) criteria.uniqueResult();
        return usersEntity;
    }

    public void save(UsersEntity usersEntity) {
        persist(usersEntity);
    }

    public void deleteById(long usersId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("userId", usersId));
        UsersEntity usersEntity = (UsersEntity) criteria.uniqueResult();
        delete(usersEntity);
    }

    public List<UsersEntity> findAllUsers() {
        return null;
    }

    public void deleteByUsersName(String usersName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("userName", usersName));
        UsersEntity usersEntity = (UsersEntity) criteria.uniqueResult();
        delete(usersEntity);
    }
}
