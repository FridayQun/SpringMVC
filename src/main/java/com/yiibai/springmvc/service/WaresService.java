package com.yiibai.springmvc.service;

import com.yiibai.springmvc.model.WaresEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
public interface WaresService {
    WaresEntity findById(long id);

    WaresEntity findByWaresName(String waresName);

    void save(WaresEntity waresEntity);

    void deleteById(long waresId);

    List<WaresEntity> findAllWares();

    void deleteByWaresName(String waresName);

}
