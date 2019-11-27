package com.sun.service.core;

/**
 * Created by sun on 2019/10/19.
 **/
public abstract class BaseService implements DmService {

    protected abstract boolean invoke();

    public abstract String getServiceName();

    @Override
    public boolean execute() {
        return this.invoke();
    }

    protected void sleep(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
