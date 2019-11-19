package com.nopainanymore.designpattern.behavior.command;

/**
 * design-pattern: TurnOnCommand
 *
 * @author nopainanymore
 * @version 2019-11-19 20:33
 */
public class TurnOnCommand implements Command {

    private Radio radio;

    private TurnOnCommand(Radio radio) {
        this.radio = radio;
    }

    public static TurnOnCommand of(Radio radio) {
        return new TurnOnCommand(radio);
    }

    @Override
    public void execute() {
        radio.on();
    }
}
