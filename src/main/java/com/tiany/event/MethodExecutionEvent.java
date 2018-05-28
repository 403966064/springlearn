package com.tiany.event;

import com.tiany.basic.MethodExecutionStatus;
import org.springframework.context.ApplicationEvent;


public class MethodExecutionEvent extends ApplicationEvent {

    private String methodsName;
    private MethodExecutionStatus status;

    public MethodExecutionEvent(Object source) {
        super(source);
    }

    public MethodExecutionEvent(Object source, String methodsName, MethodExecutionStatus status){
        super(source);
        this.methodsName = methodsName;
        this.status = status;

    }
    @Override
    public Object getSource() {
        return super.getSource();
    }

    public String getMethodsName() {
        return methodsName;
    }

    public void setMethodsName(String methodsName) {
        this.methodsName = methodsName;
    }

    public MethodExecutionStatus getStatus() {
        return status;
    }

    public void setStatus(MethodExecutionStatus status) {
        this.status = status;
    }
}


