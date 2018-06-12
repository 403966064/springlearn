package com.tiany.service;

import com.tiany.entity.Users;

/**
 * Created by tiany on 2018/6/12.
 */
public interface UsersService {

    /**
     * 插入users
     * @param users
     * @return
     */
    int insertUsers(Users users);
}
