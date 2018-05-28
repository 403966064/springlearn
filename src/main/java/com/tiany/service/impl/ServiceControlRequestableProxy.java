package com.tiany.service.impl;

import com.tiany.service.IRequestable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class ServiceControlRequestableProxy implements IRequestable {

    private IRequestable requestable;

    public ServiceControlRequestableProxy(IRequestable requestable) {
        this.requestable = requestable;
    }

    @Override
    public void request() {
        System.out.println("current time :" +new SimpleDateFormat("yyyy-MM-dd hh:MM:ss").format(new Date()));
        requestable.request();
    }

    public static void main(String[] args) {
        IRequestable target = new RequestableImpl();
        IRequestable proxy = new ServiceControlRequestableProxy(target);
        proxy.request();

    }
}
