package com.sun.gem.parse.line.strategy;

import com.sun.gem.parse.line.DialogueLineExecutor;
import com.sun.gem.parse.line.LineExecutor;

/**
 * Created by sun on 2019/12/31.
 **/
public class DialogueStrategy extends AbstractStrategy {
    @Override
    public boolean match(String str) {
        return str.startsWith("对话");
    }

    @Override
    public LineExecutor handle(String str) {
        return new DialogueLineExecutor(extract(str));
    }
}
