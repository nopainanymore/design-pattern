package com.nopainanymore.designpattern.constructure.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: AliTransitCard
 *
 * @author nopainanymore
 * @version 2019-10-14 22:51
 */
@Slf4j
public class AliTransitCard extends TransitCard {

    public AliTransitCard(Transit transit) {
        super(transit);
    }

    @Override
    void pay() {
        log.info("AliTransitCard- pay- {}", transit.getClass().getName());
        transit.pay();
    }
}
