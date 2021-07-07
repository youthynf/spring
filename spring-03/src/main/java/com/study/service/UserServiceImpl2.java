package com.study.service;

public class UserServiceImpl2 implements UserService2 {
    public String add() {
        System.out.println("UserServiceImpl2增加了用户");
        return "add";
    }

    public String delete() {
        System.out.println("UserServiceImpl2删除了用户");
        return "delete";
    }

    public String update() {
        System.out.println("UserServiceImpl2修改了用户");
        return "update";
    }

    public String select() {
        System.out.println("UserServiceImpl2查询了用户");
        return "select";
    }
}
