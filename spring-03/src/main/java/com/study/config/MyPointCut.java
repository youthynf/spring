package com.study.config;

public class MyPointCut {
    public void before() {
        System.out.println("=========方法执行之前=======");
    }

    public void after() {
        System.out.println("=========方法执行之后=======");
    }
}
