package com.nopainanymore.designpattern.constructure.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: TaskBlocker
 *
 * @author nopainanymore
 * @version 2019-10-21 20:00
 */
@Slf4j
public class TaskBlocker {


    public Boolean testBlock(Task task) {
        if (task.getNumber() != null && task.getNumber() < 1_000) {
            log.info("TaskBlocker- testBlock- true");
            return true;
        }
        log.info("TaskBlocker- testBlock- false");
        return false;
    }

}
