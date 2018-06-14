package com.tiany.service.impl;

import com.tiany.dao.MoneyDao;
import com.tiany.entity.Logger;
import com.tiany.entity.Money;
import com.tiany.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MoneyServiceImpl implements MoneyService {
    @Autowired
    private MoneyDao moneyDao;

    @Override
    //@Transactional(propagation = Propagation.REQUIRED)
    public int paySomeoneMoney(Integer sourceUserId, Integer targetUserId, Double money) {
        Money sourceMoney = new Money();
        sourceMoney.setUserId(sourceUserId);
        sourceMoney.setMoney(money);

        moneyDao.decreaseMoney(sourceMoney);

       /* *//**异常点*//*
        System.out.println(1/0);*/
        Money targetMoney = new Money();
        targetMoney.setUserId(targetUserId);
        targetMoney.setMoney(money);
        moneyDao.decreaseMoney(sourceMoney);
        return 0;
    }

    @Override
    @Logger(addLogger = "1")
    public int getMoney(Double money) {
        System.out.println("获取到money："+money);
        return 0;
    }
}
