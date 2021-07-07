package com.study.service;

public class UserServiceImpl implements UserService {
    public String add() {
        System.out.println("UserServiceImpl增加了用户");
        return "add";
    }

    public String delete() {
        System.out.println("UserServiceImpl删除了用户");
        return "delete";
    }

    public String update() {
        System.out.println("UserServiceImpl修改了用户");
        return "update";
    }

    public String select() {
        System.out.println("UserServiceImpl查询了用户");
        return "select";
    }
}
