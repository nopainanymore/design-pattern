package com.nopainanymore.designpattern.constructure.proxy.statics;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: StaticsProxy
 *
 * @author nopainanymore
 * @version 2019-07-20 23:17
 */
@Slf4j
public class StaticsProxy implements ExInterface {

    private EClass eClass;

    public StaticsProxy(EClass eClass) {
        this.eClass = eClass;
    }

    @Override
    public void execute() {
        log.info("StaticsProxy- execute- this is proxy execute target method");
        eClass.execute();
    }
}
