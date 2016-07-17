package com.yiibai.springmvc.service;

import com.yiibai.springmvc.model.ShippingEntity;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
public interface ShippingService {
    ShippingEntity findById(long id);

    ShippingEntity findByShippingName(String shippingName);

    void save(ShippingEntity shippingEntity);

    void deleteById(long shippingId);

    List<ShippingEntity> findAllShippings();

    void deleteByShippingName(String shippingName);
}
