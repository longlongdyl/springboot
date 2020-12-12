package com.sh2004.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sh2004.mapper.StudentMapper;
import com.sh2004.springboot.eneity.QueryVo;
import com.sh2004.springboot.eneity.Student;
import com.sh2004.springboot.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.service
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/7 17:25
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service(interfaceClass = StudentService.class,version = "1.0.2",timeout = 15000)
@Component
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student updateStudent(Student student) {
        if (null == student.getId()){
            studentMapper.insertSelective(student);
        }else {
            studentMapper.updateByPrimaryKeySelective(student);
        }

        return student;
    }

    @Override
    public List<Student> allStudent(QueryVo queryVo) {
        List<Student> list = studentMapper.selectAllStudent(queryVo);
        return list;
    }

    @Override
    public void deleteStudent(Integer id) {
        studentMapper.deleteByPrimaryKey(id);
    }
}
