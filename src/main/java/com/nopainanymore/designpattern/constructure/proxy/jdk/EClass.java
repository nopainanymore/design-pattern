package com.nopainanymore.designpattern.constructure.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: EClass
 *
 * @author nopainanymore
 * @version 2019-05-04 16:13
 */
@Slf4j
public class EClass implements ExInterface {

    @Override
    public void execute() {
        log.info("EClass- execute- execute method");
    }

    public void noProxy(){
        log.info("EClass- noProxy- normal");
    }
}
