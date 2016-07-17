package com.yiibai.springmvc.service;

import com.yiibai.springmvc.dao.DepotDao;
import com.yiibai.springmvc.model.DepotEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lenovo on 2016/7/15.
 */
@Service("depotService")
@Transactional
public class DepotServiceImpl implements DepotService {
    @Autowired
    DepotDao depotDao;

    public DepotEntity findById(long id) {
        return depotDao.findById(id);
    }

    public void save(DepotEntity depotEntity) {
        depotDao.save(depotEntity);
    }

    public void deleteById(long depotId) {
        depotDao.deleteById(depotId);
    }

    public List<DepotEntity> findAllDepots() {
        return depotDao.findAllDepots();
    }

}
