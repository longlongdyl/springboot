package com.sh2004.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.config
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/6 0:12
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Component
@ConfigurationProperties(prefix = "dyl")
public class ConfigInfo {
    private String baba;
    private String zaijian;

    @Override
    public String toString() {
        return "ConfigInfo{" +
                "baba='" + baba + '\'' +
                ", zaijian='" + zaijian + '\'' +
                '}';
    }

    public String getBaba() {
        return baba;
    }

    public void setBaba(String baba) {
        this.baba = baba;
    }

    public String getZaijian() {
        return zaijian;
    }

    public void setZaijian(String zaijian) {
        this.zaijian = zaijian;
    }
}
