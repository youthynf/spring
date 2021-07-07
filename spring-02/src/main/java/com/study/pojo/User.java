package com.study.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 注意：@Component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层！
 * dao 【@Repository】
 * service【@Service】
 * controller【@Controller】
 * 这四个注解功能都是一样的，都是代表将某个类注册到Spring中，装配Bean
 *
 * 配合：@Scope(value = "singleton")实现单例
 */
@Component
@Scope(value = "singleton")
public class User {
    @Value("1")
    private int id;

    @Value("呵呵呵")
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
