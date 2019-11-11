package com.nopainanymore.designpattern.constructure.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: DecoratorClient
 *
 * @author nopainanymore
 * @version 2019-07-22 22:10
 */
@Slf4j
public class DecoratorClient {

    public static void main(String[] args) {
        RawMaterial panCake = new OriginalPancake();
        panCake = new Lettuce(panCake);
        panCake = new Ham(panCake);
        log.info("Client- main- total cost : ${}", panCake.costMoney());
    }

}
