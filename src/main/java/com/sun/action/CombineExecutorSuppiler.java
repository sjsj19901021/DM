package com.sun.action;

import java.util.List;

/**
 * Created by sun on 2019/10/20.
 **/
public class CombineExecutorSuppiler implements ExecutorSuppiler {

    private List<ExecutorSuppiler> executors;

    public CombineExecutorSuppiler(List<ExecutorSuppiler> executors) {
        this.executors = executors;
    }


    @Override
    public Boolean get() {
        for (ExecutorSuppiler suppiler : executors) {
            Boolean isSuccess = suppiler.get();
            if (!isSuccess) {
                return false;
            }
        }
        return true;
    }
}
