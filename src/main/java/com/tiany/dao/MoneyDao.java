package com.tiany.dao;

import com.tiany.entity.Money;
import org.apache.ibatis.annotations.Update;

public interface MoneyDao {

    @Update({"update money set money = money - #{money} where user_id = #{userId}"})
    int decreaseMoney(Money money);

    @Update({"update money set money = money + #{money} where user_id = #{userId}"})
    int increaseMoney(Money money);

}
