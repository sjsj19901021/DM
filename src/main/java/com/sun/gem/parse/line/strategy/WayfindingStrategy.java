package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.LineExecutor;
import com.sun.gem.parse.line.WayfindingLineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public class WayfindingStrategy extends AbstractStrategy {
    @Override
    public boolean match(String str) {
        return str.startsWith("寻路");
    }

    @Override
    public LineExecutor handle(String str) {
        return new WayfindingLineExecutor(extract(str));
    }
}
