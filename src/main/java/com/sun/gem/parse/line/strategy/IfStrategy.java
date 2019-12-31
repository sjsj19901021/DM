package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.IfLineExecutor;
import com.sun.gem.parse.line.LineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public class IfStrategy extends AbstractStrategy {
    @Override
    public boolean match(String str) {
        return str.startsWith("如果");
    }

    @Override
    public LineExecutor handle(String str) {
        return new IfLineExecutor(extract(str));
    }
}
