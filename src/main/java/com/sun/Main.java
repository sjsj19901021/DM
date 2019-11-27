package com.sun;


import com.sun.base.EnvManager;
import com.sun.base.LocalAmount;
import com.sun.service.business.BaseServiceBuilder;
import com.sun.service.business.collect.CollectService;
import com.sun.service.business.login.LoginService;
import com.sun.service.business.rubbish.GiveUpRubbishService;
import com.sun.service.core.EnvServiceImpl;
import com.sun.service.core.ServiceFactory;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sun on 2019/10/19.
 **/
public class Main {
    public static void main(String[] args) {
        EnvServiceImpl service = new EnvServiceImpl();
        List<LocalAmount> localAmounts = service.config();
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for (LocalAmount amount : localAmounts)
            executorService.submit(() -> {
                EnvManager.INSTANCE.put(Thread.currentThread().getName(), amount);
                ServiceFactory.getCommonServiceLink().execute();
            });

    }
}
