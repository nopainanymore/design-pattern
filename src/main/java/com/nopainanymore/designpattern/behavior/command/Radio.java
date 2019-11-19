package com.nopainanymore.designpattern.behavior.command;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: Radio
 *
 * @author nopainanymore
 * @version 2019-11-19 20:34
 */
@Slf4j
public class Radio {

    public void on() {
        log.info("Radio- on- radio is on now!");
    }

    public void off() {
        log.info("Radio- off- bye~");
    }
}
