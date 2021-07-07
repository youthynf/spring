package com.study.service;

public class UserServiceImpl3 implements UserService3 {
    public String add() {
        System.out.println("UserServiceImpl3增加了用户");
        return "add";
    }

    public String delete() {
        System.out.println("UserServiceImpl3删除了用户");
        return "delete";
    }

    public String update() {
        System.out.println("UserServiceImpl3修改了用户");
        return "update";
    }

    public String select() {
        System.out.println("UserServiceImpl3查询了用户");
        return "select";
    }
}
