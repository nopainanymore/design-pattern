package com.nopainanymore.designpattern.constructure.bridge;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * design-pattern: Bus
 *
 * @author nopainanymore
 * @version 2019-10-14 22:47
 */
@Slf4j
public class Bus implements Transit {

    private static BigDecimal cost = new BigDecimal(2);

    @Override
    public BigDecimal pay() {
        log.info("Bus- pay- {}", cost);
        return cost;
    }
}
