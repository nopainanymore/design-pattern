package com.nopainanymore.designpattern.behavior.templetemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: Coffee
 *
 * @author nopainanymore
 * @version 2019-10-30 15:54
 */
@Slf4j
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        log.info("Coffee- brew");
    }

    @Override
    void addCondiments() {
        log.info("Coffee- addCondiments");
    }
}
