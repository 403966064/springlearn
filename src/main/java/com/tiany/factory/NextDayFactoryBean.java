package com.tiany.factory;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDayFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(calendar.getTime());
    }

    @Override
    public Class<?> getObjectType() {
        return String.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
