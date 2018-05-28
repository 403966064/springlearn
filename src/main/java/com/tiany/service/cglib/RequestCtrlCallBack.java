package com.tiany.service.cglib;


import com.tiany.annotion.ClassLevelAnnotion;
import com.tiany.annotion.MethodLevelAnnotion;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

@ClassLevelAnnotion
public class RequestCtrlCallBack implements MethodInterceptor {


    @Override
    @MethodLevelAnnotion
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(method.getName().equalsIgnoreCase("request")){
            System.out.println("cglib ");
            System.out.println("current time :" +new SimpleDateFormat("yyyy-MM-dd hh:MM:ss").format(new Date()));
            return methodProxy.invokeSuper(o, objects);
        }
        return null;
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Requestable.class);
        enhancer.setCallback(new RequestCtrlCallBack());
        Requestable proxy = (Requestable)enhancer.create();
        proxy.request();
    }
}
