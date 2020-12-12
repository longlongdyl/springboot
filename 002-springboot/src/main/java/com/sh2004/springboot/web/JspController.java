package com.sh2004.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.web
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/6 0:35
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class JspController {

    @RequestMapping(value = "/springBoot/jsp")
    public String jsp(Model model) {

        model.addAttribute("data","SpringBoot 前端使用JSP页面！");

        return "index";
    }

}
