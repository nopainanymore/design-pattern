package com.nopainanymore.designpattern.constructure.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: TaskChecker
 *
 * @author nopainanymore
 * @version 2019-10-21 20:01
 */
@Slf4j
public class TaskChecker {

    public Boolean check(Task task) {
        if (task.getSource() != null && !"".equals(task.getSource())) {
            log.info("TaskChecker- check- true");
            return true;
        }
        log.info("TaskChecker- check- false");
        return false;
    }

}
