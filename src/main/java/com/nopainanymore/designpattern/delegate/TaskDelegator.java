package com.nopainanymore.designpattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * design-pattern: TaskStrategy
 *
 * @author nopainanymore
 * @version 2019-07-13 22:47
 */
public class TaskDelegator implements Task {

    private static Map<String, Task> taskMap = new HashMap<>();

    static {
        taskMap.put("install", new InstallTask());
        taskMap.put("uninstall", new UninstallTask());
    }

    private String strategy;

    public TaskDelegator(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public void runTask() {
        taskMap.get(strategy).runTask();
    }
}
