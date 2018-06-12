package com.tiany.service.impl;

import com.tiany.dao.UsersDao;
import com.tiany.entity.Users;
import com.tiany.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tiany on 2018/6/12.
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDao usersDao;
    @Override
    public int insertUsers(Users users) {
        return usersDao.insert(users);
    }
}
