package com.nopainanymore.designpattern.constructure.bridge;

/**
 * design-pattern: BridgeClient
 *
 * @author nopainanymore
 * @version 2019-09-08 15:19
 */
public class BridgeClient {

    public static void main(String[] args) {
        Transit bus = new Bus();
        TransitCard aliTransitCard = new AliTransitCard(bus);
        aliTransitCard.pay();
        aliTransitCard.setTransit(new Metro());
        aliTransitCard.pay();

        Transit metro = new Metro();
        TransitCard materialTransitCard = new MaterialTransitCard(metro);
        materialTransitCard.pay();
        materialTransitCard.setTransit(new Bus());
        materialTransitCard.pay();
    }
}
