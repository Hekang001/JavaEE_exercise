package com.kang.pro.Dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dao {
    public String name;

    public String getName() {
        return name;
    }

    @Value("hekang")
    public void setName(String name) {
        this.name = name;
    }
}
