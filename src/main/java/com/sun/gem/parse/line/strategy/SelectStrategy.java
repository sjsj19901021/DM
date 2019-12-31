package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.LineExecutor;
import com.sun.gem.parse.line.SelectLineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public class SelectStrategy extends AbstractStrategy {
    @Override
    public boolean match(String str) {
        return str.startsWith("选择");
    }

    @Override
    public LineExecutor handle(String str) {
        return new SelectLineExecutor(extract(str));
    }
}
