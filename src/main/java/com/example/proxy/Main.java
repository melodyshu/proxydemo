package com.example.proxy;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Payment payment=new ThirdPayment();
        payment.pay("zs");

        //静态代理
        //每个代理类只能为一个接口服务，这样程序开发中必然会产生许多的代理类
        Payment payment1=new ThirdChannelPoxy(new ThirdPayment());
        payment1.pay("xs");
    }
}
