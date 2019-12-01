package com.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 * JDK动态代理类只能代理接口（不支持抽象类)
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;
    public Object bind(Object target){
        this.target=target;
        Object obj=Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
        System.out.println(obj.toString());
        return obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("记录日志开始");
        Object result= method.invoke(target,args);
        System.out.println("记录日志结束");
        return result;
    }
}
