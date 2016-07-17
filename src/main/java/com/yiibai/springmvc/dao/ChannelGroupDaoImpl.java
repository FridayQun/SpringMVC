package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.ChannelGroupEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Repository("channelGroupDao")
public class ChannelGroupDaoImpl extends AbstractDao<Long, ChannelGroupEntity> implements ChannelGroupDao {
    public ChannelGroupEntity findById(long id) {
        return getByKey(id);
    }

    public void save(ChannelGroupEntity channelGroupEntity) {
        persist(channelGroupEntity);
    }

    public void deleteById(long channelGroupId) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", channelGroupId));
        ChannelGroupEntity channelGroupEntity = (ChannelGroupEntity) criteria.uniqueResult();
        delete(channelGroupEntity);
    }

    public List<ChannelGroupEntity> findAllChannelGroups() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//to avoid duplicates.
        List<ChannelGroupEntity> channelGroupEntities = (List<ChannelGroupEntity>) criteria.list();
        return channelGroupEntities;
    }

}
