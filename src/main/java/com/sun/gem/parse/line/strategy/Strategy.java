package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.LineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public interface Strategy {

    boolean match(String str);

    LineExecutor handle(String str);
}
