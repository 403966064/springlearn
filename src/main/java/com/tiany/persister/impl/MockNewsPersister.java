package com.tiany.persister.impl;

import com.tiany.basic.FXNewsBean;
import com.tiany.persister.FXNewsPersister;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class MockNewsPersister implements FXNewsPersister, BeanFactoryAware{
    private BeanFactory beanFactory;
    @Override
    public void persisterNewsBean() {
        System.out.println("persist bean" +getNewsBean());
    }

    @Override
    public FXNewsBean getNewsBean() {
        return (FXNewsBean) beanFactory.getBean("fxNewsBean");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
