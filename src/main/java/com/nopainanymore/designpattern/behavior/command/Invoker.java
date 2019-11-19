package com.nopainanymore.designpattern.behavior.command;

/**
 * design-pattern: Invoker
 *
 * @author nopainanymore
 * @version 2019-11-19 20:39
 */
public class Invoker {

    private Command turnOnCommand;

    private Command turnOffCommand;

    public Invoker(Command turnOnCommand, Command turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

    public void turnOnRadio() {
        turnOnCommand.execute();
    }

    public void turnOffRadio() {
        turnOffCommand.execute();
    }
}
