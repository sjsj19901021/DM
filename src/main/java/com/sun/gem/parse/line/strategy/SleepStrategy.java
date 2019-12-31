package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.LineExecutor;
import com.sun.gem.parse.line.SleepLineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public class SleepStrategy extends AbstractStrategy {
    @Override
    public boolean match(String str) {
        return str.startsWith("等待");
    }

    @Override
    public LineExecutor handle(String str) {
        return new SleepLineExecutor(extract(str));
    }
}
