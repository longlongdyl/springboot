package com.sh2004.springboot.web;

import com.sh2004.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.web
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/6 1:29
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@RestController
public class RestStudentController {
    @Autowired
    private StudentService studentService;

}
