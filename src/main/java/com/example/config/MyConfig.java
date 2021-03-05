package com.example.config;

import com.example.pojo.People;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class MyConfig {

    @Bean(name = {"people1"})
    public People getPeople1(){
        People people = new People();
        people.setName("张三");

        return people;
    }
}
