package com.momo.cloud.eurekauserclient.dao;


import com.momo.cloud.eurekauserclient.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    User findByName(@Param("name") String name);
}
