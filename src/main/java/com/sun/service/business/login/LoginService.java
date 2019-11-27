package com.sun.service.business.login;

import com.sun.action.ExecutorBuilder;
import com.sun.action.ExecutorSuppiler;
import com.sun.action.KeyDownExecutor;
import com.sun.action.KeyUpExecutor;
import com.sun.action.LeftClickExecutor;
import com.sun.action.PicLocation;
import com.sun.action.SendMsgExecutor;
import com.sun.action.XyLocation;
import com.sun.base.EnvManager;
import com.sun.base.User;
import com.sun.service.core.BaseService;

/**
 * Created by sun on 2019/10/19.
 **/
public class LoginService extends BaseService {


    @Override
    protected boolean invoke() {
        User user = EnvManager.INSTANCE.get(Thread.currentThread().getName()).getUser();
        ExecutorSuppiler suppiler = new ExecutorBuilder()
                .begin(() -> new LeftClickExecutor().apply(new PicLocation("login\\1.bmp")))
                .link(() -> new LeftClickExecutor().apply(new PicLocation("login\\2.bmp")))
                .link(deleteAll(() -> new KeyDownExecutor("back").apply(new PicLocation("login\\2.bmp")), () -> new KeyUpExecutor("back").apply(new PicLocation("login\\2.bmp"))))
                .link(() -> new SendMsgExecutor(user.getUserName()).apply(new PicLocation("login\\2.bmp")))
                .link(() -> new LeftClickExecutor().apply(new XyLocation(426, 259)))
                .link(() -> new SendMsgExecutor(user.getPassword()).apply(new XyLocation(426, 259)))
                .link(() -> new LeftClickExecutor().apply(new XyLocation(400, 331)))
                .link(() -> new LeftClickExecutor(new XyLocation(725, 582)).apply(new PicLocation("login\\3.bmp")))
                ////签到
                .link(() -> new LeftClickExecutor().apply(new PicLocation("login\\4.bmp")))
                .link(() -> new LeftClickExecutor().apply(new PicLocation("login\\5.bmp")))
                .link(() -> new LeftClickExecutor().apply(new PicLocation("login\\6.bmp")))
                .build();
        suppiler.get();

        return false;
    }

    private ExecutorSuppiler deleteAll(ExecutorSuppiler keydown, ExecutorSuppiler keyup) {
        return () -> {
            for (int i = 0; i < 15; i++) {
                keydown.get();
                keyup.get();
            }
            return true;
        };
    }

    @Override
    public String getServiceName() {
        return "角色登录";
    }
}
