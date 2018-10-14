package com.momo.cloud.eurekauserclient.service.impl;

import com.momo.cloud.eurekauserclient.dao.CityDao;
import com.momo.cloud.eurekauserclient.pojo.City;
import com.momo.cloud.eurekauserclient.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public City findById(Long id) {
        return cityDao.findById(id);
    }
}
