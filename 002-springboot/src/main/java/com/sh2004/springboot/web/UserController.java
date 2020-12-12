package com.sh2004.springboot.web;

import com.sh2004.springboot.Service.UserService;
import org.springframework.stereotype.Controller;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.web
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/7 13:47
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class UserController {

        //@Reference注册是由阿里所提供
        //@Reference注解 相当于<dubbo:reference id="" interface="" version="" check="false"/>
        //如果服务提供者
        @Reference(interfaceClass = UserService.class,version = "1.0.0",timeout = 15000,check=false)
        private UserService userService;

        @RequestMapping(value = "/springBoot/hello")
        @ResponseBody
        public Object hello(HttpServletRequest request, Model model) {
            String sayHello = userService.say("SpringBoot");
            return sayHello;
        }


}
