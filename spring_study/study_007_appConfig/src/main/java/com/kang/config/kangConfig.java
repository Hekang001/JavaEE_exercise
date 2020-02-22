package com.kang.config;

import com.kang.pro.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration   //这个也会被Spring托管，注册到容器中，因为它本身就是一个@Component
//@Configuration 表示一个配置类，就和我们之前看到的beans.xml是一样的
public class kangConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
