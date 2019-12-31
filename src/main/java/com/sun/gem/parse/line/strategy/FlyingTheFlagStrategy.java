package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.FlyingTheFlagExecutor;
import com.sun.gem.parse.line.LineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public class FlyingTheFlagStrategy extends AbstractStrategy {
    @Override
    public boolean match(String str) {
        return str.startsWith("飞行旗");
    }

    @Override
    public LineExecutor handle(String str) {
        return new FlyingTheFlagExecutor(extract(str));
    }
}
