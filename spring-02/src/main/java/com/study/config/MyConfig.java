package com.study.config;

import com.study.pojo.User2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.study.pojo")
public class MyConfig {
    @Bean
    public User2 getUserByJavaConfig() {
        return new User2(1, "我是通过JavaConfig注册的");
    }
}
