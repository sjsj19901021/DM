package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.FlagLineExecutor;
import com.sun.gem.parse.line.LineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public class FlagStrategy extends AbstractStrategy {
    @Override
    public boolean match(String str) {
        return str.startsWith("标识");
    }

    @Override
    public LineExecutor handle(String str) {
        return new FlagLineExecutor(extract(str));
    }
}
