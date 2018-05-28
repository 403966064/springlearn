package com.tiany.service.impl;

import com.tiany.service.IRequestable;

public class RequestableImpl implements IRequestable {
    @Override
    public void request() {
        System.out.println("request processed in RequestableImpl");
    }
}
