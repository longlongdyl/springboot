package com.sh2004.web;


import com.sh2004.springboot.eneity.QueryVo;
import com.sh2004.springboot.eneity.Student;
import com.sh2004.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/*
*
 * @ProjectName: springboot
 * @Package: com.sh2004.web
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/7 18:58
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020

*/


@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/student/all")
    @ResponseBody
    public List<Student> queryAllStudent(QueryVo queryVo){
        List<Student> students = studentService.allStudent(queryVo);
        return students;
    }


}