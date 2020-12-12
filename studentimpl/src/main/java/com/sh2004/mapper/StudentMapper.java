package com.sh2004.mapper;

import com.sh2004.springboot.eneity.QueryVo;
import com.sh2004.springboot.eneity.Student;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.mapper
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/7 18:55
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface StudentMapper extends Mapper<Student> {

    List<Student> selectAllStudent(QueryVo queryVo);
}
