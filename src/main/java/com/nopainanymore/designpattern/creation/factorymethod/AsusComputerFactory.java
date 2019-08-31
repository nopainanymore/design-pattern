package com.nopainanymore.designpattern.creation.factorymethod;

import com.nopainanymore.designpattern.creation.simplefactory.AsusComputer;
import com.nopainanymore.designpattern.creation.simplefactory.Computer;

/**
 * design-pattern: AsusComputerFactory
 *
 * @author nopainanymore
 * @version 2019-07-29 12:25
 */
public class AsusComputerFactory extends AbstractComputerFactory {

    @Override
    Computer createComputer() {
        return new AsusComputer();
    }

}
