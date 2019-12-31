package com.sun.gem.parse.line;

/**
 * Created by sun on 2019/12/31.
 * 等待
 **/
public class SleepLineExecutor extends AbstractLineExecutor{

    private String time;

    public SleepLineExecutor(String time) {
        this.time = time;
    }

    @Override
    public void execute() {
        try {
            Thread.sleep(Integer.valueOf(time));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
