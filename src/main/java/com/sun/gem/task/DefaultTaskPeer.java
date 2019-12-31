package com.sun.gem.task;

import com.sun.gem.parse.line.LineExecutor;

import java.util.List;

/**
 * Created by sun on 2019/12/31.
 **/
public class DefaultTaskPeer implements TaskPeer {

    private String flag;

    private List<LineExecutor> executors;

    public DefaultTaskPeer(String flag, List<LineExecutor> executors) {
        this.flag = flag;
        this.executors = executors;
    }

    @Override
    public String getFlag() {
        return flag;
    }

    @Override
    public void execute() {

    }
}
