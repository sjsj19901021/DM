package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.LineExecutor;
import com.sun.gem.parse.line.UseLineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public class UseStrategy extends AbstractStrategy {
    @Override
    public boolean match(String str) {
        return str.startsWith("使用");
    }

    @Override
    public LineExecutor handle(String str) {
        return new UseLineExecutor(extract(str));
    }
}
