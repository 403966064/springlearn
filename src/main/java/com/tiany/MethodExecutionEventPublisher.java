package com.tiany;

import com.tiany.basic.MethodExecutionStatus;
import com.tiany.event.MethodExecutionEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MethodExecutionEventPublisher implements ApplicationEventPublisherAware{
    private ApplicationEventPublisher applicationEventPublisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void methodToMonitor(){
        MethodExecutionEvent beginEvt = new MethodExecutionEvent(this, "methodToMonitor", MethodExecutionStatus.BEGIN);
        publicEvent(beginEvt);
        MethodExecutionEvent endEvt = new MethodExecutionEvent(this, "methodToMonitor", MethodExecutionStatus.END);
        publicEvent(endEvt);

    }

    protected void publicEvent(MethodExecutionEvent methodExecutionEvent){
        applicationEventPublisher.publishEvent(methodExecutionEvent);
    }


    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MethodExecutionEventPublisher eventPublisher = (MethodExecutionEventPublisher) applicationContext.getBean("evtPublisher");
        eventPublisher.methodToMonitor();
    }
}