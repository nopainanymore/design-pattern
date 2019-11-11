package com.nopainanymore.designpattern.constructure.proxy.cglib;

/**
 * design-pattern: CGLibClient
 *
 * @author nopainanymore
 * @version 2019-05-04 17:53
 */
public class CGLibClient {

    public static void main(String[] args) {
        EClass eClass = new EClass();
        CGLibProxy proxy = new CGLibProxy(eClass);
        proxy.createProxy().execute();
    }
}
