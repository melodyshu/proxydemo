package com.example.proxy;

public class PaymentLogger {
    public void log(String uid){
        System.out.println("uid:"+uid+":发起了支付行为,记录日志");
    }
}
