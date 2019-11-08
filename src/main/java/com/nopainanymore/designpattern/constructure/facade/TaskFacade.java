package com.nopainanymore.designpattern.constructure.facade;

/**
 * design-pattern: TaskFacade
 *
 * @author nopainanymore
 * @version 2019-10-21 20:00
 */
public class TaskFacade {

    private TaskChecker taskChecker = new TaskChecker();

    private TaskBlocker taskBlocker = new TaskBlocker();

    public Boolean test(Task task) {
        return taskBlocker.testBlock(task);
    }

    public Boolean check(Task task) {
        return taskChecker.check(task);
    }
}
