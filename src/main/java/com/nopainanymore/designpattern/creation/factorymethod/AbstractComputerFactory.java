package com.nopainanymore.designpattern.creation.factorymethod;

import com.nopainanymore.designpattern.creation.simplefactory.Computer;

/**
 * design-pattern: AbstractComputerFactory
 *
 * @author NoPainAnymore
 * @date 2019-07-29 12:24
 */
public abstract class AbstractComputerFactory {

    abstract Computer createComputer();


}
