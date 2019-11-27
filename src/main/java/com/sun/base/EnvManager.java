package com.sun.base;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by sun on 2019/10/19.
 **/
public enum EnvManager {

    INSTANCE;

    /**
     * key threadName
     */
    private Map<String, LocalAmount> localAmountMap = new ConcurrentHashMap<>();

    public void put(String key, LocalAmount value) {
        localAmountMap.putIfAbsent(key, value);
    }

    public LocalAmount get(String key) {
        return localAmountMap.get(key);
    }
}
