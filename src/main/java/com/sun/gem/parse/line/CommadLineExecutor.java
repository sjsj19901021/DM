package com.sun.gem.parse.line;

/**
 * Created by sun on 2019/12/31.
 * 命令
 **/
public class CommadLineExecutor extends AbstractLineExecutor {

    private String msg;

    public CommadLineExecutor(String msg) {
        this.msg = msg;
    }

    @Override
    public void execute() {
        //什么都不干
    }
}
