package com.nopainanymore.designpattern.creation.abstractfactory;

/**
 * design-pattern: AbstractDoorFactory
 *
 * @author nopainanymore
 * @version 2019-07-30 23:41
 */
public abstract class AbstractDoorFactory {

    abstract AbstractKey createKey();

    abstract AbstractLock createLock();

}
