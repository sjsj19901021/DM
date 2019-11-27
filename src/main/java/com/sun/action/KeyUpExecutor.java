package com.sun.action;

/**
 * Created by sun on 2019/10/20.
 **/
public class KeyUpExecutor extends AbstractExecutor {

    private String str;

    public KeyUpExecutor(String str) {
        this.str = str;
    }

    @Override
    protected Boolean invoke(Location location) {
        return dm.KeyUpChar(str) == 1;
    }

    @Override
    protected boolean needCheckLocation() {
        return false;
    }
}
