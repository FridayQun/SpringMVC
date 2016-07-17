package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.ChannelGroupEntity;
import com.yiibai.springmvc.model.ChannelInfoEntity;
import com.yiibai.springmvc.model.RoleEntity;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Repository("channelInfoDao")
public class ChannelInfoDaoImpl extends AbstractDao<Long, ChannelInfoEntity> implements ChannelInfoDao {
    public ChannelInfoEntity findById(long id) {
        return getByKey(id);
    }

    public void save(ChannelInfoEntity channelInfoEntity) {
        persist(channelInfoEntity);
    }

    public void deleteById(long id) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        ChannelInfoEntity channelInfoEntity = (ChannelInfoEntity) criteria.uniqueResult();
        delete(channelInfoEntity);
    }

    public List<ChannelInfoEntity> findAllChannelInfos() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//to avoid duplicates.
        List<ChannelInfoEntity> channelInfoEntity = (List<ChannelInfoEntity>) criteria.list();
        return channelInfoEntity;
    }
}
