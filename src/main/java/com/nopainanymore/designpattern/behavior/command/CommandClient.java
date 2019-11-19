package com.nopainanymore.designpattern.behavior.command;

/**
 * design-pattern: CommandClient
 *
 * @author nopainanymore
 * @version 2019-11-19 19:57
 */
public class CommandClient {

    public static void main(String[] args) {
        Radio radio = new Radio();
        Invoker invoker = new Invoker(TurnOnCommand.of(radio), TurnOffCommand.of(radio));
        invoker.turnOnRadio();
        invoker.turnOffRadio();
    }
}
