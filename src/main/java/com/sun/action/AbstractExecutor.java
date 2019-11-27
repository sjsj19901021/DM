package com.sun.action;

import com.sun.base.EnvManager;
import com.sun.base.IdmSoft;
import com.sun.base.LocalAmount;
import com.sun.base.User;
import com.sun.base.Window;
import com.sun.exception.DmException;

/**
 * Created by sun on 2019/10/20.
 **/
public abstract class AbstractExecutor implements Executor {

    protected IdmSoft dm;

    protected User user;

    protected Window window;

    protected int count = 0;


    public AbstractExecutor() {
        LocalAmount localAmount = EnvManager.INSTANCE.get(Thread.currentThread().getName());
        if (localAmount != null) {
            dm = localAmount.getDm();
            user = localAmount.getUser();
            window = localAmount.getWindow();
        }
    }

    @Override
    public Boolean apply(Location location) {
        if (needCheckLocation()) {
            while (!location.isExist()) {
                if (count < 120) {
                    sleep(1000);
                    count++;
                } else {
                    throw new DmException("Location查询失败");
                }
            }
        }
        return invoke(location);
    }

    protected abstract Boolean invoke(Location location);

    protected boolean needCheckLocation() {
        return true;
    }

    protected void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
