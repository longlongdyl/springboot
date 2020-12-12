package com.sh2004;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
//@MapperScan("com.sh2004.mapper")
@tk.mybatis.spring.annotation.MapperScan("com.sh2004.mapper")
public class StudentImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentImplApplication.class, args);
        }

        }
