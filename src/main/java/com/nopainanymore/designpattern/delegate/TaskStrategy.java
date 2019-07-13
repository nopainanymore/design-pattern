package com.nopainanymore.designpattern.delegate;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * design-pattern: TaskStrategy
 *
 * @author NoPainAnymore
 * @date 2019-07-13 22:47
 */
public class TaskStrategy implements ITask {

    private static Map<String, ITask> taskMap = new HashMap<>();

    static {
        taskMap.put("install", new InstallTask());
        taskMap.put("uninstall", new UninstallTask());
    }

    private String strategy;

    public TaskStrategy(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public void runTask() {
        taskMap.get(strategy).runTask();
    }
}
