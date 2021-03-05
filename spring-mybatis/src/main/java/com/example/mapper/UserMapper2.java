package com.example.mapper;

import com.example.pojo.User;

import java.util.List;

public interface UserMapper2 {
    public List<User> selectUser() throws Exception;

    public void deleteUser(String name) throws Exception;
}
