package com.z.dubboconsumer.com.controller;


import com.dto.User;
import com.service.UserService;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zxx
 * @Date: 2020/3/27 22:20
 * @Description: *
 */
@RestController
public class UserController {

    @Reference
    UserService userService;

    @ResponseBody
    @RequestMapping("/getuserlist")
    public List<User> getUserList(){
        return userService.getUserList();
    }

}
