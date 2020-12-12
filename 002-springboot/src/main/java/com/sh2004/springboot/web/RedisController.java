package com.sh2004.springboot.web;

import com.sh2004.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.web
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/6 21:45
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@RestController
public class RedisController {
    @Autowired
    private StudentService studentService;
    private Long allStudentCount;
    /**
     * 请求地址：http://localhost:9090/016-springboot-redis//springboot/allStudentCount
     * @param request
     * @return
     */
    @GetMapping(value = "/springboot/allStudentCount")
    public Object allStudentCount(HttpServletRequest request) {

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (int i = 0; i <155 ; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    allStudentCount = studentService.queryAllStudentCount();
                }
            });
        }

        return "学生总人数：" + allStudentCount;
    }
}


