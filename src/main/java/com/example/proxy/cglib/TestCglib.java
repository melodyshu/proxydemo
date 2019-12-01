package com.example.proxy.cglib;

/**
 * cglib实现动态代理
 */
public class TestCglib {
    public static void main(String[] args) {
        UserServiceImpl user=new UserServiceImpl();
        UserServiceCglib cglib=new UserServiceCglib();
        UserServiceImpl p1= (UserServiceImpl) cglib.getInstance(user);
        p1.addUser();
    }
}
