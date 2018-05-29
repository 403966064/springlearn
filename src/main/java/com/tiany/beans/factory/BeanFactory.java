package com.tiany.beans.factory;

/**
 * Created by tiany on 2018/5/29.
 */

/**
 * bean factory 创建对象实例
 */
public class BeanFactory {

    /**
     * 根据名称来获取对象实例
     * @param name
     * @return
     */
    public Object getBean(String name){
        try {
            if(name != null || !"".equals(name)){
                Class clazz = Class.forName(name);
                return clazz.newInstance();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
