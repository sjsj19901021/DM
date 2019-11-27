package com.sun.action;

import com.sun.base.EnvConsant;

/**
 * Created by sun on 2019/10/20.
 **/
public class KeyDownExecutor extends AbstractExecutor {

    private String str;

    public KeyDownExecutor(String str) {
        this.str = str;
    }

    @Override
    protected Boolean invoke(Location location) {
        int x = location.getX();
        int y = location.getY();
        int moveTo = dm.MoveTo(x, y);
        if (moveTo == 1) {
            sleep(EnvConsant.DELAY);
            int code = dm.KeyDownChar(str);
            if (code == 1) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected boolean needCheckLocation() {
        return false;
    }
}
