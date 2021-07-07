package com.study.mapper;

import com.study.pojo.User;

import java.util.List;

public interface UserMapper {
    /*
     * 查看所有用户
     * */
    List<User> selectUser();

    //增加用户
    int addUser(User user);

    //删除用户
    int deleteUser(int id);
}
