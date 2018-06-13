package com.tiany.service;

public interface MoneyService {

    int paySomeoneMoney(Integer sourceUserId, Integer targetUserId, Double money);


    int getMoney(Double money);
}
