package com.nopainanymore.designpattern.behavior.mediator;

import java.math.BigDecimal;

/**
 * design-pattern: RentMediator
 *
 * @author nopainanymore
 * @version 2019-11-08 22:31
 */
public abstract class RentMediator {

    abstract void deal();

    abstract void offerRoom(Boolean hasRoom);

    abstract void requireRoom(Integer roomSize, BigDecimal rent);
}
