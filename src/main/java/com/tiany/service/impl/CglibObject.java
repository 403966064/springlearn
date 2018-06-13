package com.tiany.service.impl;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by tiany on 2018/6/13.
 */
public class CglibObject implements MethodInterceptor {
    private Object object;

    public CglibObject(Object object) {
        this.object = object;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CglibObject 处理");
        if(method.getName().equals("paySomeoneMoney")){
            System.out.println("执行的是 paySomeoneMoney 方法");
        }
        return methodProxy.invoke(object, objects);
    }
}
