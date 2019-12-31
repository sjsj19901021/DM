package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.CommadLineExecutor;
import com.sun.gem.parse.line.LineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public class CommadStrategy extends AbstractStrategy {
    @Override
    public boolean match(String str) {
        return str.startsWith("命令");
    }

    @Override
    public LineExecutor handle(String str) {
        return new CommadLineExecutor(extract(str));
    }
}
