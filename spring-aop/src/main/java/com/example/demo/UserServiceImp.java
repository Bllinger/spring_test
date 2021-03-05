package com.example.demo;

import jdk.jfr.Name;
import org.springframework.stereotype.Component;

@Component("user")
public class UserServiceImp implements UserService{
    @Override
    public void insert() {
        System.out.println("插入");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("更新");
    }

    @Override
    public void select() {
        System.out.println("查询");
    }
}
