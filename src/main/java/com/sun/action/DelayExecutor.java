package com.sun.action;

import com.sun.base.EnvConsant;

/**
 * Created by sun on 2019/10/21.
 **/
public class DelayExecutor implements Executor {

    private long mis;

    public DelayExecutor(long mis) {
        this.mis = mis;
    }

    public DelayExecutor() {
    }

    @Override
    public Boolean apply(Location location) {
        try {
            long time = EnvConsant.DELAY;
            if (mis > EnvConsant.DELAY) {
                time = mis;
            }
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return true;
    }
}
