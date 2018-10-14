package com.momo.cloud.eurekauserclient.service;

import com.momo.cloud.eurekauserclient.pojo.City;
import org.apache.ibatis.annotations.Param;

public interface CityService {

    City findById(@Param("id") Long id);
}
