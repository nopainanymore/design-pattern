package com.nopainanymore.designpattern.constructure.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: MaterialTransitCard
 *
 * @author nopainanymore
 * @version 2019-10-14 22:52
 */
@Slf4j
public class MaterialTransitCard extends TransitCard {

    public MaterialTransitCard(Transit transit) {
        super(transit);
    }

    @Override
    void pay() {
        log.info("MaterialTransitCard- pay- {}", transit.getClass().getName());
        transit.pay();
    }
}
