package com.yiibai.springmvc.service;

import com.yiibai.springmvc.dao.ShippingDao;
import com.yiibai.springmvc.model.ShippingEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Service("shippingService")
@Transactional
public class ShippingServiceImpl implements ShippingService {
    @Autowired
    ShippingDao shippingDao;

    public ShippingEntity findById(long id) {
        return shippingDao.findById(id);
    }

    public ShippingEntity findByShippingName(String shippingName) {
        return shippingDao.findByShippingName(shippingName);
    }

    public void save(ShippingEntity shippingEntity) {
        shippingDao.save(shippingEntity);
    }

    public void deleteById(long shippingId) {
        shippingDao.deleteById(shippingId);
    }

    public List<ShippingEntity> findAllShippings() {
        return shippingDao.findAllShippings();
    }

    public void deleteByShippingName(String shippingName) {
        shippingDao.deleteByShippingName(shippingName);
    }
}
