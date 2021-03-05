package com.example.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;


@Component
public class People {
    @Autowired
    private Dog dog2;
    @Autowired
    private Cat cat2;
    private String name;


//    public People(String name){
//        this.name = name;
//    }
    public Dog getDog() {
        return dog2;
    }

    public void setDog(Dog dog) {
        this.dog2 = dog;
    }

    public Cat getCat() {
        return cat2;
    }

    public void setCat(Cat cat) {
        this.cat2 = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "dog=" + dog2 +
                ", cat=" + cat2 +
                ", name='" + name + '\'' +
                '}';
    }
}
