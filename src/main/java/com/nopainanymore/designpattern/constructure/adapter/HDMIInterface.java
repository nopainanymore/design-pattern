package com.nopainanymore.designpattern.constructure.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: HDMIInterface
 *
 * @author nopainanymore
 * @version 2019-09-08 14:50
 */
@Slf4j
public class HDMIInterface implements Interface {

    @Override
    public void connect() {
        log.info("HDMIInterface- display- connect to HDMI display device ");
    }
}
