package com.nopainanymore.designpattern.delegate;

/**
 * design-pattern: TaskManager
 *
 * @author nopainanymore
 * @version 2019-07-13 22:37
 */
public class TaskManager {

    public static void main(String[] args) {
        new TaskStrategy("install").runTask();
        new TaskStrategy("uninstall").runTask();
    }

}
