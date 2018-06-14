package com.tiany.route;

/**
 * Created by tiany on 2018/6/14.
 */
public class DynamicDataSourceHolder {

    private static final ThreadLocal<String> THREAD_DATA_SOURCE = new ThreadLocal<>();

    public static String getDataSource(){
        return THREAD_DATA_SOURCE.get();
    }

    public static void setDataSource(String dataSource){
        THREAD_DATA_SOURCE.set(dataSource);
    }

    public static void clearDataSource(){
        THREAD_DATA_SOURCE.remove();
    }
}
