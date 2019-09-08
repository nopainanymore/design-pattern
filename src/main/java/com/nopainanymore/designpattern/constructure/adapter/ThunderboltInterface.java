package com.nopainanymore.designpattern.constructure.adapter;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: ThunderboltInterface
 *
 * @author nopainanymore
 * @version 2019-09-08 14:53
 */
@Slf4j
@Getter
@Setter
public class ThunderboltInterface implements Interface {

    private Interface hdmi;

    private Interface usb;

    public ThunderboltInterface() {
    }

    @Override
    public void connect() {
        charging();
        transferByUSB();
        display();
    }

    private void charging() {
        log.info("ThunderboltInterface- charging to Mac");
    }

    private void transferByUSB() {
        if (usb != null) {
            usb.connect();
        } else {
            log.info("ThunderboltInterface- interface is Thunderbolt, transfer data with high speed");
        }
    }

    private void display() {
        if (hdmi != null) {
            hdmi.connect();
        } else {
            log.info("ThunderboltInterface- display- interface is Thunderbolt, display by Thunderbolt 3");
        }
    }
}
