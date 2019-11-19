package com.nopainanymore.designpattern.behavior.command;

/**
 * design-pattern: TurnOffCommand
 *
 * @author nopainanymore
 * @version 2019-11-19 20:33
 */
public class TurnOffCommand implements Command {

    private Radio radio;

    private TurnOffCommand(Radio radio) {
        this.radio = radio;
    }

    public static TurnOffCommand of(Radio radio) {
        return new TurnOffCommand(radio);
    }

    @Override
    public void execute() {
        radio.off();
    }
}
