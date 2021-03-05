package com.example.demo;

import org.springframework.stereotype.Component;

@Component("diyLog")
public class DiyLog {
    public void before(){
        System.out.println("执行函数前");
    }

    public void after(){
        System.out.println("执行函数后");
    }
}
