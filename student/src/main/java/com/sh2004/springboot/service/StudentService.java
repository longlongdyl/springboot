package com.sh2004.springboot.service;

import com.sh2004.springboot.eneity.QueryVo;
import com.sh2004.springboot.eneity.Student;

import java.util.List;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.service
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/7 17:17
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface StudentService {
    Student updateStudent (Student student);
    List<Student> allStudent(QueryVo queryVo);
    void deleteStudent(Integer id);
}
