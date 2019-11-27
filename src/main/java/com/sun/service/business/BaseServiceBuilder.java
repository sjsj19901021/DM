package com.sun.service.business;

import com.sun.service.core.BaseService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sun on 2019/10/21.
 **/
public class BaseServiceBuilder {

    private List<BaseService> baseServices = new ArrayList<>();

    public BaseServiceBuilder begin(BaseService baseService) {
        this.baseServices.add(baseService);
        return this;
    }

    public BaseServiceBuilder link(BaseService baseService) {
        this.baseServices.add(baseService);
        return this;
    }

    public BaseServiceBuilder end(BaseService baseService) {
        this.baseServices.add(baseService);
        return this;
    }

    public BaseService build() {
        return new CombineService(baseServices);
    }
}
