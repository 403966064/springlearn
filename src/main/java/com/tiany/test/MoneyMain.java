package com.tiany.test;

import com.tiany.service.MoneyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoneyMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MoneyService moneyService = (MoneyService) applicationContext.getBean("moneyServiceImpl");
        moneyService.paySomeoneMoney(1, 2,10d);
    }
}
