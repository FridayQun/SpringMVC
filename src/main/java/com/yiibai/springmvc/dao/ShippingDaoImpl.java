package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.RoleEntity;
import com.yiibai.springmvc.model.ShippingEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Repository("shippingDao")
public class ShippingDaoImpl extends AbstractDao<Long, ShippingEntity> implements ShippingDao {
    public ShippingEntity findById(long id) {
        return getByKey(id);
    }

    public ShippingEntity findByShippingName(String shippingName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("shippingId", shippingName));
        ShippingEntity shippingEntity = (ShippingEntity) criteria.uniqueResult();
        return shippingEntity;
    }

    public void save(ShippingEntity shippingEntity) {
        persist(shippingEntity);
    }

    public void deleteById(long id) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        ShippingEntity shippingEntity = (ShippingEntity) criteria.uniqueResult();
        delete(shippingEntity);
    }

    public List<ShippingEntity> findAllShippings() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//to avoid duplicates.
        List<ShippingEntity> shippingEntity = (List<ShippingEntity>) criteria.list();
        return shippingEntity;
    }

    public void deleteByShippingName(String shippingName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("shippingId", shippingName));
        ShippingEntity ShippingEntity = (ShippingEntity) criteria.uniqueResult();
        delete(ShippingEntity);
    }
}
