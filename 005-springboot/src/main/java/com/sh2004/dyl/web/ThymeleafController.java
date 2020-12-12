package com.sh2004.dyl.web;

import com.sh2004.dyl.eneity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.dyl.web
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/10 19:18
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class ThymeleafController {
    @RequestMapping("/web")
    public String index(HttpServletRequest request, Model model) {

        List<Map<String,Student>> list = new ArrayList<>();
          Map<String,Student> map = new TreeMap<>();
        for (int i = 0; i <10 ; i++) {
            Student student = new Student();
            student.setId(i);
            student.setName(i+"zz");
            student.setAge(i);
            map.put(""+i,student);
        }
        list.add(map);
        model.addAttribute("list",list);
        return "index";
    }

}
