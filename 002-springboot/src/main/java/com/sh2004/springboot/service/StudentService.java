package com.sh2004.springboot.service;

import com.sh2004.springboot.eneity.Student;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.service
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/6 1:08
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface StudentService {
    Student queryStudentById(int i);

    Long queryAllStudentCount();
}
