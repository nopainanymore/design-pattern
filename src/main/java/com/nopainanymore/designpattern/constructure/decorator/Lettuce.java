package com.nopainanymore.designpattern.constructure.decorator;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * design-pattern: Lettuce
 *
 * @author NoPainAnymore
 * @date 2019-07-22 21:52
 */
@Slf4j
public class Lettuce extends PancakeRawMaterial {

    public Lettuce(RawMaterial rawMaterial) {
        super(rawMaterial);
    }

    @Override
    public BigDecimal costMoney() {
        moreHealth();
        log.info("ADD Lettuce- costMoney- $1");
        return rawMaterial.costMoney().add(BigDecimal.valueOf(1));
    }

    public void moreHealth() {
        log.info("Lettuce- moreHealth");
    }

}
