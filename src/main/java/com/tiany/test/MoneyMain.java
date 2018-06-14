package com.tiany.test;

import com.tiany.service.MoneyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoneyMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MoneyService moneyService = (MoneyService) applicationContext.getBean("moneyServiceImpl");
        moneyService.paySomeoneMoney(1, 2,10d);
//        moneyService.getMoney(10d);
        /**动态代理的适用范围， 对象是实现了某个接口的实现类*/
        /*MoneyProxy moneyProxy = new MoneyProxy();
        MoneyService moneyProxyService = (MoneyService)moneyProxy.newProxy(moneyService);
        moneyProxyService.paySomeoneMoney(1, 2, 10d);*/
/*
        *//**动态字节码技术*//*
        Enhancer enhancer = new Enhancer();
        *//**被代理的对象*//*
        enhancer.setSuperclass(MoneyCglibObject.class);
        enhancer.setCallback(new CglibObject(new MoneyCglibObject()));
        MoneyCglibObject moneyCglibObject = (MoneyCglibObject)enhancer.create();
        moneyCglibObject.paySomeoneMoney(1, 2,10d);*/
    }
}
