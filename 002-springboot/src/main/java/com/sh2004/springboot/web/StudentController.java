package com.sh2004.springboot.web;

import com.sh2004.springboot.eneity.Student;
import com.sh2004.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.web
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/6 1:08
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@Slf4j
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "/springBoot/student")
    @ResponseBody
    public  Object student() {
        return studentService.queryStudentById(2);
    }

}
