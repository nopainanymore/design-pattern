package com.nopainanymore.designpattern.constructure.bridge;

/**
 * design-pattern: TransportationCard
 *
 * @author nopainanymore
 * @version 2019-10-14 22:41
 */
public abstract class TransitCard {

    protected Transit transit;

    public TransitCard(Transit transit) {
        this.transit = transit;
    }

    public void setTransit(Transit transit) {
        this.transit = transit;
    }

    abstract void pay();
}
