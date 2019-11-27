package com.sun.base;

/**
 * Created by sun on 2019/10/20.
 **/
public class DMSoftFactory {

    private volatile static DMSoftFactory instance;

    private DMSoftFactory() {

    }

    public static DMSoftFactory getInstance() {
        if (instance == null) {
            synchronized (DMSoftFactory.class) {
                if (instance == null) {
                    instance = new DMSoftFactory();
                }
            }
        }
        return instance;
    }

    public IdmSoft getSoft() {
        return new DMJocSoft();
    }
}
