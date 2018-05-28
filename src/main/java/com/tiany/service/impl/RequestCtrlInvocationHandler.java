package com.tiany.service.impl;

import com.tiany.service.IRequestable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RequestCtrlInvocationHandler implements InvocationHandler {
    private Object target;

    public RequestCtrlInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       if(method.getName().equalsIgnoreCase("request")){
           System.out.println("current time :" +new SimpleDateFormat("yyyy-MM-dd hh:MM:ss").format(new Date()));
           return method.invoke(target, args);
       }
       return null;
    }

    public IRequestable getInstance(){
        return (IRequestable) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                new Class[]{IRequestable.class},
                new RequestCtrlInvocationHandler(target));
    }

    public static void main(String[] args) {
        IRequestable requestable = new RequestCtrlInvocationHandler(new RequestableImpl()).getInstance();
        requestable.request();
    }
}
