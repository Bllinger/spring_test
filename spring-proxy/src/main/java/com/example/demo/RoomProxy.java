package com.example.demo;

import java.lang.reflect.Method;

public class RoomProxy extends ProxyInvocationHandle{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        showAround();
        AgencyCost();

        return super.invoke(proxy, method, args);
    }

    private void showAround(){
        System.out.println("带看房屋");
    }

    private void AgencyCost(){
        System.out.println("收中介费");
    }
}
