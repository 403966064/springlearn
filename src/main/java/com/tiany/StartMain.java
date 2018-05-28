package com.tiany;

import com.tiany.persister.impl.MockNewsPersister;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tiany on 2018/5/23.
 */
public class StartMain {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MockNewsPersister mockNewsPersister = (MockNewsPersister) context.getBean("mockNewsPersister");

        mockNewsPersister.persisterNewsBean();
        mockNewsPersister.persisterNewsBean();

    }
}
