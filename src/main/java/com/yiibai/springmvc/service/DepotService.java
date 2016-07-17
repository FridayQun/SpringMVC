package com.yiibai.springmvc.service;

import com.yiibai.springmvc.model.DepotEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
public interface DepotService {
    DepotEntity findById(long id);

    void save(DepotEntity depotEntity);

    void deleteById(long depotId);

    List<DepotEntity> findAllDepots();

}
