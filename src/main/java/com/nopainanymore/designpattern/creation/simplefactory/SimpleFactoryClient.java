package com.nopainanymore.designpattern.creation.simplefactory;

/**
 * design-pattern: SimpleFactoryClient
 *
 * @author nopainanymore
 * @version 2019-07-25 23:13
 */
public class SimpleFactoryClient {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer = computerFactory.createComputer(ComputerFactory.COMPUTER_TYPE.MAC);
        computer.usedFor();
    }
}
