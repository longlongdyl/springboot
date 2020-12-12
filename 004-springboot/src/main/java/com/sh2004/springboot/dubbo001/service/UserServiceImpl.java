package com.sh2004.springboot.dubbo001.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sh2004.mapper.UserMapper;
import com.sh2004.springboot.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.dubbo001.service
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/7 11:55
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service(interfaceClass = UserService.class,version = "1.0.0",timeout = 15000)
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public String say(String name) {

        return name+"shabi!!!@#@!#!@#@!#";
    }
}
