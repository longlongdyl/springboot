package com.sh2004.springboot.service.impl;

import com.sh2004.springboot.eneity.Student;
import com.sh2004.springboot.mapper.StudentMapper;
import com.sh2004.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.service.impl
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/6 1:10
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
@Transactional

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    @Override
    public Student queryStudentById(int i) {
      //  studentMapper.insert(new Student());
      //  int iz = 1/0;
        return studentMapper.selectByPrimaryKey(i);
    }

    @Override
    public Long queryAllStudentCount() {
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        Long allStudentCount = (Long) redisTemplate.opsForValue().get("allStudentCount");
        if (null == allStudentCount){
            synchronized (this){
                allStudentCount = (Long) redisTemplate.opsForValue().get("allStudentCount");
                if (null == allStudentCount){
                    System.out.println("从mysql拿");
                    allStudentCount = studentMapper.selectAllStudentCount();
                    redisTemplate.opsForValue().
                            set("allStudentCount",allStudentCount,10,TimeUnit.SECONDS);
                }
            }
        }else{
            System.out.println("从redis拿");
        }
        return allStudentCount;
    }
}
