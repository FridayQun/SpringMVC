package com.yiibai.springmvc.dao;

import com.yiibai.springmvc.model.ChannelGroupEntity;
import com.yiibai.springmvc.model.DepotEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
public interface DepotDao {
    DepotEntity findById(long id);

    void save(DepotEntity depotEntity);

    void deleteById(long depotId);

    List<DepotEntity> findAllDepots();

}
