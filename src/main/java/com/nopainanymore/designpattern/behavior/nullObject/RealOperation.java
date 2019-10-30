package com.nopainanymore.designpattern.behavior.nullObject;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: RealOperation
 *
 * @author nopainanymore
 * @version 2019-10-30 17:47
 */
@Slf4j
public class RealOperation extends AbstractOperation {

    @Override
    void request() {
        log.info("RealOperation- request");
    }
}
