package com.example.mapper;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    public List<User> selectUser() throws Exception;

    @Delete("Delete from user where name=#{name}")
    public void deleteUser(String name) throws Exception;
}
