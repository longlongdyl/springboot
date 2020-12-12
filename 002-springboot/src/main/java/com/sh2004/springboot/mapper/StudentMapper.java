package com.sh2004.springboot.mapper;

import com.sh2004.springboot.eneity.Student;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan("com.sh2004.springboot.mapper")
public interface StudentMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    Long selectAllStudentCount();
}