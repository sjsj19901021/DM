package com.sun.gem.parse.line;

/**
 * Created by sun on 2019/12/31.
 **/
public abstract class AbstractLineExecutor implements LineExecutor {

    protected String extract(String str) {
        return str.substring(str.indexOf("*")+1);
    }
}
