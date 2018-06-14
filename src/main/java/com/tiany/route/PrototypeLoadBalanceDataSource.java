package com.tiany.route;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by tiany on 2018/6/14.
 */
@Component
public class PrototypeLoadBalanceDataSource extends AbstractRoutingDataSource {
    private Lock lock = new ReentrantLock();
    private int counter = 0;
    private int dataSourceNumber = 2;

    public int getDataSourceNumber() {
        return dataSourceNumber;
    }

    public void setDataSourceNumber(int dataSourceNumber) {
        this.dataSourceNumber = dataSourceNumber;
    }

    @Override
    protected Object determineCurrentLookupKey() {
        lock.lock();
        try {
            counter++;
            return DynamicDataSourceHolder.getDataSource();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        return null;
    }
}
