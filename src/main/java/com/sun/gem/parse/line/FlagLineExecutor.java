package com.sun.gem.parse.line;

/**
 * Created by sun on 2019/12/31.
 **/
public class FlagLineExecutor extends AbstractLineExecutor {

    private String flag;

    public FlagLineExecutor(String flag) {
        this.flag = flag;
    }

    @Override
    public void execute() {
        //什么都不干
    }
}
