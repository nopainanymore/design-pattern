package com.nopainanymore.designpattern.constructure.proxy.statics;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: EClass
 *
 * @author nopainanymore
 * @version 2019-07-20 23:15
 */
@Slf4j
public class EClass implements ExInterface {

    @Override
    public void execute() {
        log.info("EClass- execute");
    }
}
