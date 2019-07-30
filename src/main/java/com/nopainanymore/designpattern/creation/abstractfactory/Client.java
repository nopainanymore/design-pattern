package com.nopainanymore.designpattern.creation.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: Client
 *
 * @author NoPainAnymore
 * @date 2019-07-30 23:33
 */
@Slf4j
public class Client {

    public static void main(String[] args) {
        AbstractDoorFactory doorFactory = new PanPanDoorFactory();
        AbstractKey key = doorFactory.createKey();
        AbstractLock lock = doorFactory.createLock();
        log.info("Client- main- key:{}", key.getClass());
        log.info("Client- main- lock:{}", lock.getClass());
    }
}
