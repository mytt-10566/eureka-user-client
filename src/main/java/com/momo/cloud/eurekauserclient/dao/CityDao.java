package com.momo.cloud.eurekauserclient.dao;


import com.momo.cloud.eurekauserclient.pojo.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


/**
 * 城市 DAO 接口类
 */
@Mapper
public interface CityDao {

    City findById(@Param("id") Long id);
}
