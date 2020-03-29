package com.z.dubboprovider.serviceImpl;

import com.dto.User;
import com.service.UserService;
import com.z.dubboprovider.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zxx
 * @Date: 2020/3/27 22:14
 * @Description: *
 */
@Service
public class UserServiceimpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.selectUserList();
    }
}
