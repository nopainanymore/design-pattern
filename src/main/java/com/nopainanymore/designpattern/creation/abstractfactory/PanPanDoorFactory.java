package com.nopainanymore.designpattern.creation.abstractfactory;

/**
 * design-pattern: PanPanDoorFactory
 *
 * @author nopainanymore
 * @version 2019-07-30 23:44
 */
public class PanPanDoorFactory extends AbstractDoorFactory {

    @Override
    AbstractKey createKey() {
        return new PanPanKey();
    }

    @Override
    AbstractLock createLock() {
        return new PanPanLock();
    }
}
