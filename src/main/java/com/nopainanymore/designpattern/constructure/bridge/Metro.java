package com.nopainanymore.designpattern.constructure.bridge;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * design-pattern: Metro
 *
 * @author nopainanymore
 * @version 2019-10-14 22:49
 */
@Slf4j
public class Metro implements Transit {

    private static BigDecimal cost = new BigDecimal(5);

    @Override
    public BigDecimal pay() {
        log.info("Metro- pay- {}", cost);
        return cost;
    }
}
