package com.sun.action;

import com.sun.base.EnvConsant;

/**
 * Created by sun on 2019/10/20.
 **/
public class SendMsgExecutor extends AbstractExecutor {

    private String msg;

    public SendMsgExecutor(String msg) {
        this.msg = msg;
    }

    @Override
    public Boolean invoke(Location location) {
        int x = location.getX();
        int y = location.getY();
        int moveTo = dm.MoveTo(x, y);
        if (moveTo == 1) {
            sleep(EnvConsant.DELAY);
            int code = dm.SendString(Integer.valueOf(window.getWindowId()), msg);
            if (code == 1) {
                return true;
            }
        }
        return false;
    }
}
