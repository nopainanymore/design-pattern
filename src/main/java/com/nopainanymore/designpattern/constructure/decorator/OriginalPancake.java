package com.nopainanymore.designpattern.constructure.decorator;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * design-pattern: OriginalPancake
 *
 * @author NoPainAnymore
 * @date 2019-07-22 22:03
 */
@Slf4j
public class OriginalPancake implements RawMaterial {

    @Override
    public BigDecimal costMoney() {
        log.info("OriginalPancake- costMoney- $6");
        return BigDecimal.valueOf(6);
    }
}
