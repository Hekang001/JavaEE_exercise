package com.kang.pro;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//这个是注解的意思，就是说明这个类被Spring接管了，注册到容器中了
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
@Value("何慷")  //注入属性值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
