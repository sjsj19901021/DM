package com.sun.gem.task;

/**
 * Created by sun on 2019/12/30.
 * 任务分片,最终执行层面
 **/
public interface TaskPeer {

    /**
     *  标识符
     * @return
     */
    String getFlag();

    /**
     * 执行接口
     */

    void execute();
}
