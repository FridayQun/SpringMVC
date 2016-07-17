package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.DepotEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Repository("depotDao")
public class DepotDaoImpl extends AbstractDao<Long, DepotEntity> implements DepotDao {
    public DepotEntity findById(long id) {
        return getByKey(id);
    }

    public void save(DepotEntity depotEntity) {
        persist(depotEntity);
    }

    public void deleteById(long depotId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("depotId", depotId));
        DepotEntity depotEntity = (DepotEntity) criteria.uniqueResult();
        delete(depotEntity);
    }

    public List<DepotEntity> findAllDepots() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("depotId"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//to avoid duplicates.
        List<DepotEntity> depotEntity = (List<DepotEntity>) criteria.list();
        return depotEntity;
    }

}
