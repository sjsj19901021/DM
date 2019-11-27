package com.sun.service.business;

import com.sun.base.EnvManager;
import com.sun.base.LocalAmount;
import com.sun.service.core.BaseService;

import java.util.List;

/**
 * Created by sun on 2019/10/21.
 **/
public class CombineService extends BaseService {

    private List<BaseService> baseServices;

    public CombineService(List<BaseService> baseServices) {
        this.baseServices = baseServices;
    }

    @Override
    protected boolean invoke() {
        baseServices.forEach(baseService -> {
            printLog(baseService, Status.BEGIN);
            baseService.execute();
            printLog(baseService, Status.SUCCESS);
        });
        return false;
    }

    private void printLog(BaseService baseService, Status status) {
        String threadName = Thread.currentThread().getName();
        String serviceName = baseService.getServiceName();
        LocalAmount amount = EnvManager.INSTANCE.get(threadName);
        String format = String.format(amount.getUser().getUserName() + ":  " + serviceName + "执行");
        StringBuffer sb = new StringBuffer(format);
        if (status == Status.SUCCESS) {
            sb.append("结束");
        } else {
            sb.append("开始");
        }
        System.out.println(sb.toString());
    }

    @Override
    public String getServiceName() {
        return "汇总";
    }

    public enum Status {
        BEGIN, SUCCESS;
    }
}
