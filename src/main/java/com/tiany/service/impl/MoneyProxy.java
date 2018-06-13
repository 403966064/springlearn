package com.tiany.service.impl;

import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by tiany on 2018/6/13.
 */
@Component
public class MoneyProxy implements InvocationHandler {
    private Object targetObject;

    public Object newProxy(Object object){
        this.targetObject = object;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("MoneyProxyServiceImpl 处理");
        if(method.getName().equals("paySomeoneMoney")){
            System.out.println("执行的是 paySomeoneMoney 方法");
        }
        return method.invoke(targetObject, args);
    }
}
