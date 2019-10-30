package com.nopainanymore.designpattern.behavior.templetemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: Tea
 *
 * @author nopainanymore
 * @version 2019-10-30 15:55
 */
@Slf4j
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        log.info("Tea- brew");
    }

    @Override
    void addCondiments() {
        log.info("Tea- addCondiments");
    }
}
