package com.momo.cloud.eurekauserclient.controller;

import com.momo.cloud.eurekauserclient.pojo.User;
import com.momo.cloud.eurekauserclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserByName")
    public User getUserByName (@RequestParam String name){

        User user = userService.findByName(name);
        return user;
    }
}
