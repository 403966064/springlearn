package com.tiany.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class NextDayDisplay {

    private String nextDay;

    public void setNextDay(String nextDay) {
        this.nextDay = nextDay;
    }


    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");

        NextDayDisplay nextDayDisplay = (NextDayDisplay)application.getBean("nextDayDisplay");

        System.out.println(nextDayDisplay.nextDay);
    }
}
