package com.sun.gem.parse;

import com.sun.gem.file.FileCodeBlock;
import com.sun.gem.parse.line.LineExecutor;
import com.sun.gem.parse.line.strategy.CommadStrategy;
import com.sun.gem.parse.line.strategy.DialogueStrategy;
import com.sun.gem.parse.line.strategy.FlagStrategy;
import com.sun.gem.parse.line.strategy.FlyingTheFlagStrategy;
import com.sun.gem.parse.line.strategy.IfStrategy;
import com.sun.gem.parse.line.strategy.JumpStrategy;
import com.sun.gem.parse.line.strategy.SelectStrategy;
import com.sun.gem.parse.line.strategy.SleepStrategy;
import com.sun.gem.parse.line.strategy.Strategy;
import com.sun.gem.parse.line.strategy.UseStrategy;
import com.sun.gem.parse.line.strategy.WayfindingStrategy;
import com.sun.gem.task.DefaultTaskPeer;
import com.sun.gem.task.TaskPeer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by sun on 2019/12/31.
 **/
public enum FileCodeBlockParseManager {
    /**
     * 单例
     */
    INSTANCE;

    private List<Strategy> strategies = new ArrayList<>();

    {
        strategies.add(new FlagStrategy());
        strategies.add(new CommadStrategy());
        strategies.add(new DialogueStrategy());
        strategies.add(new FlyingTheFlagStrategy());
        strategies.add(new IfStrategy());
        strategies.add(new JumpStrategy());
        strategies.add(new SelectStrategy());
        strategies.add(new SleepStrategy());
        strategies.add(new UseStrategy());
        strategies.add(new WayfindingStrategy());
    }

    public TaskPeer parse(FileCodeBlock fileCodeBlock) {
        List<LineExecutor> executors = new ArrayList<>();
        for (String str : fileCodeBlock.getCodeblock()) {
            Optional<Strategy> strategy = findStrategy(str);
            if (strategy.isPresent()) {
                executors.add(strategy.get().handle(str));
                continue;
            }
            System.out.println("缺失LineExecutor:" + str);
        }

        String flag = fileCodeBlock.getCodeblock().get(0);
        if (flag.startsWith("标识")) {
            flag = flag.substring(flag.indexOf("[")+1, flag.indexOf("]"));
        }
        return new DefaultTaskPeer(flag, executors);

    }

    private Optional<Strategy> findStrategy(String str) {
        return strategies.stream().filter(strategy -> strategy.match(str))
                .findFirst();
    }
}
