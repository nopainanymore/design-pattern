package com.nopainanymore.designpattern.delegate;

/**
 * design-pattern: TaskManager
 *
 * @author NoPainAnymore
 * @date 2019-07-13 22:37
 */
public class TaskManager {

    public static void main(String[] args) {
        new TaskStrategy("install").runTask();
        new TaskStrategy("uninstall").runTask();
    }

}
