package com.nopainanymore.designpattern.creation.factorymethod;

import com.nopainanymore.designpattern.creation.simplefactory.Computer;
import com.nopainanymore.designpattern.creation.simplefactory.MacComputer;

/**
 * design-pattern: MacFactory
 *
 * @author NoPainAnymore
 * @date 2019-07-29 12:27
 */
public class MacFactory extends AbstractComputerFactory {

    @Override
    Computer createComputer() {
        return new MacComputer();
    }
}
