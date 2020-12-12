package com.sh2004.springboot.web;

import com.sh2004.springboot.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.web
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/5 23:04
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class SpringBootController {
    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/springBoot/say")
    @ResponseBody
    public String say(){
        return configInfo.getBaba()+configInfo.getZaijian();
    }
}
