package com.tiany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tiany on 2018/5/23.
 */
public class StartMain {

    public static void main(String[] args) {
        //BeanFactory bf = new XmlBeanFactory(new ClassPathResource("application.xml"));

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        context.getBean("");
    }
}
