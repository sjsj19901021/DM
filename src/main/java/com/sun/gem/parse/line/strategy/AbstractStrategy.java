package com.sun.gem.parse.line.strategy;

/**
 * Created by sun on 2019/12/31.
 **/
public abstract class AbstractStrategy implements Strategy {

    protected String extract(String str) {
        return str.substring(str.indexOf("[") + 1, str.indexOf("]"));
    }
}
