package com.nopainanymore.designpattern.creation.factorymethod;

import com.nopainanymore.designpattern.creation.simplefactory.Computer;

/**
 * design-pattern: Client
 *
 * @author nopainanymore
 * @version 2019-07-29 12:27
 */
public class Client {

    public static void main(String[] args) {
        AbstractComputerFactory computerFactory = new AsusComputerFactory();
        Computer computer = computerFactory.createComputer();
        computer.usedFor();
    }
}
