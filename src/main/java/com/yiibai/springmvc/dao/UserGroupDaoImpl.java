package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.RoleEntity;
import com.yiibai.springmvc.model.UserGroupEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2016/7/13.
 */
@Repository("userGroupDao")
public class UserGroupDaoImpl extends AbstractDao<Long, UserGroupEntity> implements UserGroupDao {

    public UserGroupEntity findById(String id) {
        return getByKey(Long.parseLong(id));
    }

    public void save(UserGroupEntity groupEntity) {
        persist(groupEntity);
    }

    public List<UserGroupEntity> findAllGroups() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("groupId"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//to avoid duplicates.
        List<UserGroupEntity> userGroupEntities = (List<UserGroupEntity>) criteria.list();
        return userGroupEntities;
    }
}
