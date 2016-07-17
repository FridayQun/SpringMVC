package com.yiibai.springmvc.service;

import com.yiibai.springmvc.dao.WaresDao;
import com.yiibai.springmvc.model.WaresEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Service("waresService")
@Transactional
public class WaresServiceImpl implements WaresService {
    @Autowired
    WaresDao waresDao;

    public WaresEntity findById(long id) {
        return waresDao.findById(id);
    }

    public WaresEntity findByWaresName(String waresName) {
        return waresDao.findByWaresName(waresName);
    }

    public void save(WaresEntity waresEntity) {
        waresDao.save(waresEntity);
    }

    public void deleteById(long waresId) {
        waresDao.deleteById(waresId);
    }

    public List<WaresEntity> findAllWares() {
        return waresDao.findAllWares();
    }

    public void deleteByWaresName(String waresName) {
        waresDao.deleteByWaresName(waresName);
    }
}
