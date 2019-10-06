package com.nopainanymore.designpattern.constructure.flyweight;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: ConcreteFlyWeight
 *
 * @author nopainanymore
 * @version 2019-09-22 21:24
 */
@Slf4j
public class ConcreteFlyWeight implements FlyWeight {

    private String unchangeable;

    private String changeable;

    public ConcreteFlyWeight(String unchangeable) {
        this.unchangeable = unchangeable;
    }

    @Override
    public void setChangeable(String changeable) {
        this.changeable = changeable;

    }

    @Override
    public String getLogUnchangeable() {
        log.info("ConcreteFlyWeight- getLogUnchangeable- unchangeable:{} , changeable:{}", unchangeable, changeable);
        return unchangeable;
    }
}
