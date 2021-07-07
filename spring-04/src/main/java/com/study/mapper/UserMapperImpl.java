package com.study.mapper;

import com.study.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * 本类主要是用来封装原始的sqlSession操作，后续会将这个耦合操作进行解耦
 */
public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public SqlSessionTemplate getSqlSession() {
        return sqlSession;
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> getUserList() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }
}
