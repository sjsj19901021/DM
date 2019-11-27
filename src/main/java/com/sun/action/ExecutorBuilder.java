package com.sun.action;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sun on 2019/10/20.
 **/
public class ExecutorBuilder {

    private List<ExecutorSuppiler> executors = new ArrayList<>();

    public ExecutorBuilder begin(ExecutorSuppiler executor) {
        executors.add(executor);
        return this;
    }

    public ExecutorBuilder link(ExecutorSuppiler executor) {
        executors.add(executor);
        return this;
    }

    public ExecutorBuilder end(ExecutorSuppiler executor) {
        executors.add(executor);
        return this;
    }

    public ExecutorSuppiler build() {
        return new CombineExecutorSuppiler(executors);
    }
}
