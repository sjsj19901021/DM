package com.sun.service.core;

import com.sun.service.business.BaseServiceBuilder;
import com.sun.service.business.login.LoginService;


/**
 * Created by sun on 2019/11/17.
 **/
public enum ServiceFactory {

    INSTANCE;

    public static DmService getCommonServiceLink() {
        return new BaseServiceBuilder()
                .begin(new LoginService())
//                        .end(new CollectService())
                .build();
    }
}
