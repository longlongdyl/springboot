package com.sh2004.springboot.web;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.web
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/6 21:28
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@RestController
public class RESTfulController {


    /**
     * 添加学生
     * 请求地址：http://localhost:9090/014-springboot-restful/springBoot/student/wangpeng/23
     * 请求方式：POST
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "/springBoot/student/{name}/{age}")
    public Object addStudent(@PathVariable("name") String name,
                             @PathVariable("age") Integer age) {

        Map<String,Object> retMap = new HashMap<String, Object>();
        retMap.put("name",name);
        retMap.put("age",age);


        return retMap;
    }

    /**
     * 删除学生
     * 请求地址：http://localhost:9090/014-springboot-restful/springBoot/student/1
     * 请求方式：Delete
     * @param id
     * @return
     */
    @DeleteMapping(value = "/springBoot/student/{id}")
    public Object removeStudent(@PathVariable("id") Integer id) {

        return "删除的学生id为：" + id;
    }

    /**
     * 修改学生信息
     * 请求地址：http://localhost:9090/014-springboot-restful/springBoot/student/2
     * 请求方式：Put
     * @param id
     * @return
     */
    @PutMapping(value = "/springBoot/student/{id}")
    public Object modifyStudent(@PathVariable("id") Integer id) {

        return "修改学生的id为" + id;
    }

    @GetMapping(value = "/springBoot/student/{id}")
    public Object queryStudent(@PathVariable("id") Integer id) {

        return "查询学生的id为" + id;
    }
}

