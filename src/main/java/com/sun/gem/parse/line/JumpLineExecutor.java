package com.sun.gem.parse.line;

import com.sun.gem.parse.TaskPeerManager;

/**
 * Created by sun on 2019/12/31.
 * 跳转
 **/
public class JumpLineExecutor extends AbstractLineExecutor {

    private String flag;

    public JumpLineExecutor(String flag) {
        this.flag = flag;
    }

    @Override
    public void execute() {
        TaskPeerManager.INSTANCE.getTaskPeer(flag).execute();
    }
}
