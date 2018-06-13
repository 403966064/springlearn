package com.tiany.service.impl;

import com.tiany.dao.MoneyDao;
import com.tiany.entity.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by tiany on 2018/6/13.
 */
@Component
public class MoneyCglibObject {
    @Autowired
    private MoneyDao moneyDao;

    public int paySomeoneMoney(Integer sourceUserId, Integer targetUserId, Double money) {
        Money sourceMoney = new Money();
        sourceMoney.setUserId(sourceUserId);
        sourceMoney.setMoney(money);
        moneyDao.decreaseMoney(sourceMoney);
        return 0;
    }
}
