package com.sun.service.business.collect;

import com.sun.action.DelayExecutor;
import com.sun.action.LeftClickExecutor;
import com.sun.action.PicLocation;
import com.sun.action.RigthClickExecutor;
import com.sun.action.XyLocation;
import com.sun.base.EnvManager;
import com.sun.base.LocalAmount;
import com.sun.service.core.BaseService;

/**
 * Created by sun on 2019/10/25.
 **/
public class CollectService extends BaseService {
    @Override
    protected boolean invoke() {
        LocalAmount localAmount = EnvManager.INSTANCE.get(Thread.currentThread().getName());

        if (localAmount.getUser().getNickname().equals("甜甜小奶牛")) {
            return true;
        }

        XyLocation location = new XyLocation(780, 286);
        //打开包裹
        new LeftClickExecutor().apply(new PicLocation("ui\\package.bmp"));
        //整理
        new LeftClickExecutor().apply(new PicLocation("ui\\order.bmp"));

        new LeftClickExecutor().apply(new PicLocation("ui\\packageName.bmp"));

        PicLocation autoCollect = new PicLocation("collect\\1.bmp");
        if (autoCollect.isExist()) {
            //如果药水还存在则点击采集
            new LeftClickExecutor().apply(location);
        } else {
            //如果不存在药水则吃药水后再采集
            eatAndcollect();
        }

        while (true) {
            //半小时监测次
            try {
                Thread.sleep(60 * 1000 * 20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!new PicLocation("collect\\1.bmp").isExist()) {
                eatAndcollect();
            }

        }
    }

    private void eatAndcollect() {
        new RigthClickExecutor().apply(new PicLocation("collect\\2.bmp"));
        new DelayExecutor(1000).apply(null);
        XyLocation location = new XyLocation(780, 286);
        new LeftClickExecutor().apply(location);
    }

    @Override
    public String getServiceName() {
        return "采集任务";
    }
}
