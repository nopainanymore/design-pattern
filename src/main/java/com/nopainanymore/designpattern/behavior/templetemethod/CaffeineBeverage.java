package com.nopainanymore.designpattern.behavior.templetemethod;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: CaffeineBeverage
 *
 * @author nopainanymore
 * @version 2019-10-30 15:42
 */
@Slf4j
public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    private void boilWater() {
        log.info("CaffeineBeverage- boilWater");
    }

    private void pourInCup() {
        log.info("CaffeineBeverage- pourInCup");
    }
}
