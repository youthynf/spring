package com.study.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class People3 {
    /**
     * 比较：@Resource和@Autowired：
     * 1、都是用来自动装配的，都可以放在属性字段上
     * 2、@Autowired 通过byType的方式实现，若是通过该类型无法判断，也就是有多个相同的相同的属性的bean则会使用byname进行装配，若俩种都无法使用就报错【常用】
     * 3、@Resource默认通过byname的方式实现，如果找不到名字，则通过byType实现！如果两个都找不到的情况下，就报错！并且Resource不是spring里的，存在java中的。
     */
    @Autowired
    private Dog dog;

    @Autowired
    private Cat cat;

    @Autowired
    @Qualifier(value = "snake221")
    private Snake snake;

    private String name;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog +
                ", cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
