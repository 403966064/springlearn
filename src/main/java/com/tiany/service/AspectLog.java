package com.tiany.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class AspectLog {

    @Around("within(com.tiany.service.impl.MoneyServiceImpl) ")
    public int addLog(ProceedingJoinPoint joinPoint){

        System.out.println("addLog");
        try {
            return (int)joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return 0;
    }

    @Before("within(com.tiany.service.impl.MoneyServiceImpl) && @annotation(com.tiany.entity.Logger)")
    public void beforeDo(JoinPoint joinPoint, String addLogger){
        System.out.println(addLogger);
        System.out.println("获取到的参数是："+ Arrays.toString(joinPoint.getArgs()));
        System.out.println("beforeDo");
    }
}
