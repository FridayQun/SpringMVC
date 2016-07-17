package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.WaresEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Repository("waresDao")
public class WaresDaoImpl extends AbstractDao<Long, WaresEntity> implements WaresDao {
    public WaresEntity findById(long id) {
        return getByKey(id);
    }

    public WaresEntity findByWaresName(String waresName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("wareCode", waresName));
        WaresEntity waresEntity = (WaresEntity) criteria.uniqueResult();
        return waresEntity;
    }

    public void save(WaresEntity waresEntity) {
        persist(waresEntity);
    }

    public void deleteById(long waresId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("wareId", waresId));
        WaresEntity WaresEntity = (WaresEntity) criteria.uniqueResult();
        delete(WaresEntity);
    }

    public List<WaresEntity> findAllWares() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("wareId"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//to avoid duplicates.
        List<WaresEntity> waresEntity = (List<WaresEntity>) criteria.list();
        return waresEntity;
    }

    public void deleteByWaresName(String waresName) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("wareCode", waresName));
        WaresEntity waresEntity = (WaresEntity) criteria.uniqueResult();
        delete(waresEntity);
    }
}
