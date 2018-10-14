package com.momo.cloud.eurekauserclient.service;

import com.momo.cloud.eurekauserclient.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    User findByName(@Param("name") String name);
}
