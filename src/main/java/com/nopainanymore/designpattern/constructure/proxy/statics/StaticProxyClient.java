package com.nopainanymore.designpattern.constructure.proxy.statics;

/**
 * design-pattern: StaticProxyClient
 *
 * @author nopainanymore
 * @version 2019-07-20 23:19
 */
public class StaticProxyClient {

    public static void main(String[] args) {
        EClass eClass = new EClass();
        StaticsProxy proxy = new StaticsProxy(eClass);
        proxy.execute();
    }
}
