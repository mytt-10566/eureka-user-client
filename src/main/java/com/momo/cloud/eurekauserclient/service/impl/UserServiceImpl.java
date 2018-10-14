package com.momo.cloud.eurekauserclient.service.impl;

import com.momo.cloud.eurekauserclient.dao.UserDao;
import com.momo.cloud.eurekauserclient.pojo.User;
import com.momo.cloud.eurekauserclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByName(String name){
        return userDao.findByName(name);
    }
}
