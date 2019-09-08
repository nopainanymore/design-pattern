package com.nopainanymore.designpattern.constructure.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: USBInterface
 *
 * @author nopainanymore
 * @version 2019-09-08 14:51
 */
@Slf4j
public class USBInterface implements Interface {

    @Override
    public void connect() {
        log.info("USBInterface- connect to USB device");
    }

}

