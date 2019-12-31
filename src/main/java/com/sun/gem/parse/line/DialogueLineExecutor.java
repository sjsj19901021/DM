package com.sun.gem.parse.line;

/**
 * Created by sun on 2019/12/31.
 * 对话
 **/
public class DialogueLineExecutor extends AbstractLineExecutor{

    private String dialoStr;

    public DialogueLineExecutor(String dialoStr) {
        this.dialoStr = dialoStr;
    }

    @Override
    public void execute() {
        String person = extract(dialoStr);
        // TODO: 2019/12/31
        //点击周围人，对话person
    }
}
