package com.tiany.dao;

import com.tiany.entity.Users;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by tiany on 2018/6/12.
 */
public interface UsersDao {

    @Insert({"insert into users(id, name) value (#{id}, #{name})"})
    int insert(Users users);
}
