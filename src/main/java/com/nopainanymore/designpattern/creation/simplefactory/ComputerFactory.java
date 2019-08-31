package com.nopainanymore.designpattern.creation.simplefactory;

/**
 * design-pattern: ComputerFactory
 *
 * @author nopainanymore
 * @version 2019-07-24 23:21
 */
public class ComputerFactory {

    public enum COMPUTER_TYPE {
        ASUS,
        MAC;

        COMPUTER_TYPE() {
        }

    }

    public Computer createComputer(COMPUTER_TYPE type) {
        if (COMPUTER_TYPE.MAC.equals(type)) {
            return new MacComputer();
        } else if (COMPUTER_TYPE.ASUS.equals(type)) {
            return new AsusComputer();
        } else {
            return null;
        }
    }

}
