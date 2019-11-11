package com.nopainanymore.designpattern.constructure.adapter;

/**
 * design-pattern: AdapterClient
 *
 * @author nopainanymore
 * @version 2019-08-01 22:30
 */
public class AdapterClient {

    public static void main(String[] args) {
        ThunderboltInterface thunderboltInterface = new ThunderboltInterface();
        thunderboltInterface.setHdmi(new HDMIInterface());
        thunderboltInterface.connect();

        ThunderboltInterface thunderboltInterface1 = new ThunderboltInterface();
        thunderboltInterface1.setUsb(new USBInterface());
        thunderboltInterface1.connect();
    }

}
