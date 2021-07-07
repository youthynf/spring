package com.study.mapper;

import com.study.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> getUserList() {
        // 实际上本质还是使用sqlSessionTemplate
        return getSqlSession().getMapper(UserMapper.class).getUserList();
    }
}
