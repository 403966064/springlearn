package com.tiany.test;

import com.tiany.entity.Users;
import com.tiany.service.UsersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tiany on 2018/6/12.
 */
public class UsersMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersService usersService = (UsersService) applicationContext.getBean("usersServiceImpl");
        Users users = new Users();
        users.setName("liLei");
        users.setId(1);
        System.out.println(usersService.insertUsers(users));
    }
}
