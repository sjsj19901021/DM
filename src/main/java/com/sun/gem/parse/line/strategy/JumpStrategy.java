package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.JumpLineExecutor;
import com.sun.gem.parse.line.LineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public class JumpStrategy extends AbstractStrategy {
    @Override
    public boolean match(String str) {
        return str.startsWith("跳转");
    }

    @Override
    public LineExecutor handle(String str) {
        return new JumpLineExecutor(extract(str));
    }
}
