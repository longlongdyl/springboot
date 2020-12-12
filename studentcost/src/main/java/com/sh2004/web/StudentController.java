package com.sh2004.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sh2004.springboot.eneity.QueryVo;
import com.sh2004.springboot.eneity.Student;
import com.sh2004.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
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
@Slf4j
public class StudentController {

    @Reference(interfaceClass = StudentService.class, version = "1.0.2", timeout = 15000, check = false)
    private StudentService studentService;

    @RequestMapping("/student/all1")
    public String queryAllStudent(Integer id) {
        studentService.deleteStudent(id);
        return "forward:/student/all2";
    }

    @RequestMapping("/student/all2")
    public String queryAllStudent2(HttpServletRequest request, Model model,
                                   @RequestParam(defaultValue = "1",required = false)Integer page,
                                   @RequestParam(defaultValue = "5",required = false) Integer pageSize,
                                   QueryVo queryVo) {
        System.out.println(queryVo);
        List<Student> list = studentService.allStudent(queryVo);
        model.addAttribute("list", list);
        int pageStart = page * pageSize - pageSize;
        int pageEnd = page * pageSize - 1;
        model.addAttribute("pageStart", pageStart);
        model.addAttribute("pageEnd", pageEnd);
        model.addAttribute("page", page);
        model.addAttribute("total", list.size());
        model.addAttribute("pageSize", pageSize);
        double j = list.size();
        double i = Math.ceil(j/ pageSize);
        model.addAttribute("totalPages", i);
        model.addAttribute("query", queryVo);
        return "index";
    }

    @RequestMapping("/student/all3")
    public String queryAllStudent3(Student student) {
        if (null != student.getName()) {
            studentService.updateStudent(student);
        }
        return "forward:/student/all2";
    }

    @RequestMapping("/toTemplates/{templates}")
    public String toView(
            @PathVariable(value = "templates", required = false) String templates) {

        return templates;
    }
}

