package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper2Impl extends SqlSessionDaoSupport implements UserMapper2{
    @Autowired
    public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<User> selectUser() throws Exception {
        UserMapper2 mapper = this.getSqlSession().getMapper(UserMapper2.class);
        return mapper.selectUser();
    }

    @Override
    public void deleteUser(String name) throws Exception {
        this.getSqlSession().getMapper(UserMapper2.class).deleteUser(name);
    }
}
