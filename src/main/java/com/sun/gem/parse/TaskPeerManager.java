package com.sun.gem.parse;

import com.sun.gem.file.FileCodeBlock;
import com.sun.gem.task.TaskPeer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sun on 2019/12/31.
 * 解析FileCodeBlock中含义,全局的
 **/
public enum TaskPeerManager {

    /**
     * 单例
     */
    INSTANCE;

    private List<TaskPeer> taskPeerList = new ArrayList<>();

    private Map<String, TaskPeer> taskPeerMap = new HashMap<>();


    public void parseFileCodeBlocks(List<FileCodeBlock> fileCodeBlocks) {
        fileCodeBlocks.forEach(code -> {
            TaskPeer parse = FileCodeBlockParseManager.INSTANCE.parse(code);
            taskPeerList.add(parse);
            taskPeerMap.put(parse.getFlag(), parse);
        });
    }

    public TaskPeer getTaskPeer(String flag) {
        return taskPeerMap.get(flag);
    }

    public List<TaskPeer> getAllTaskPeer() {
        return taskPeerList;
    }

}
