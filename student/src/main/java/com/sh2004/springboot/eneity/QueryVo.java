package com.sh2004.springboot.eneity;

import java.io.Serializable;

/**
 * @ProjectName: springboot
 * @Package: com.sh2004.springboot.eneity
 * @Description: java类作用描述
 * @Author: 邓禹龙
 * @CreateDate: 2020/12/12 17:03
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */

public class QueryVo implements Serializable {

    private static final long serialVersionUID = -840084677099080334L;
    private String queryName;
    private String ageStart;
    private String ageEnd;


    @Override
    public String toString() {
        return "queryVo{" +
                "queryName='" + queryName + '\'' +
                ", ageStart='" + ageStart + '\'' +
                ", ageEnd='" + ageEnd + '\'' +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public String getAgeStart() {
        return ageStart;
    }

    public void setAgeStart(String ageStart) {
        this.ageStart = ageStart;
    }

    public String getAgeEnd() {
        return ageEnd;
    }

    public void setAgeEnd(String ageEnd) {
        this.ageEnd = ageEnd;
    }
}
