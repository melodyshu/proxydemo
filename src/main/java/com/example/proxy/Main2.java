package com.example.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理调用
 */
public class Main2 {
    public static void main(String[] args) {
        DynamicProxy dynamicProxy=new DynamicProxy();
        Payment payment=new ThirdPayment();
        Payment p1= (Payment) dynamicProxy.bind(payment);
        p1.pay("ux");

        //将代理类输出
        byte[] bytes=ProxyGenerator.generateProxyClass("$Proxy0",ThirdPayment.class.getInterfaces());
        String filename="$Proxy.class";

        try(OutputStream outputStream=new FileOutputStream(filename)){
            outputStream.write(bytes);
            outputStream.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
