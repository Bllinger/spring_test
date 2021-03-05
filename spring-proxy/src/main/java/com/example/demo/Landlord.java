package com.example.demo;

public class Landlord implements Rent{
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
