package com.tiany.listener;

import com.tiany.event.MethodExecutionEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MethodExecutionEventListener implements ApplicationListener {


    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(applicationEvent instanceof MethodExecutionEvent){
            System.out.println("当前执行的事件是［MethodExecutionEvent］");
        }
    }
}
