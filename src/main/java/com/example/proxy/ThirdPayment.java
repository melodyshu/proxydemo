package com.example.proxy;

public class ThirdPayment implements Payment {
    @Override
    public String pay(String uid) {
        System.out.println("uid:"+uid+" 发起了支付");
        return "success";
    }
}
