package com.nopainanymore.designpattern.creation.simplefactory;

/**
 * design-pattern: ComputerFactory
 *
 * @author NoPainAnymore
 * @date 2019-07-24 23:21
 */
public class ComputerFactory {

    public enum COMPUTER_TYPE {
        ASUS("asus"),
        MAC("mac");

        COMPUTER_TYPE(String type) {
            this.type = type;
        }

        private String type;

        public String getType() {
            return type;
        }
    }

    public Computer createComputer(String type) {
        if (COMPUTER_TYPE.MAC.type.equals(type)) {
            return new MacComputer();
        } else if (COMPUTER_TYPE.ASUS.type.equals(type)) {
            return new AsusComputer();
        } else {
            return null;
        }
    }

}
