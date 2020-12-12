package com.sh2004.springboot.dubbo001;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Dubbo001Application {

    public static void main(String[] args) {
        SpringApplication.run(Dubbo001Application.class, args);
    }

}
