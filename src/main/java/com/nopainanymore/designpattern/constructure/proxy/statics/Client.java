package com.nopainanymore.designpattern.constructure.proxy.statics;

/**
 * design-pattern: Client
 *
 * @author NoPainAnymore
 * @date 2019-07-20 23:19
 */
public class Client {

    public static void main(String[] args) {
        EClass eClass = new EClass();
        StaticsProxy proxy = new StaticsProxy(eClass);
        proxy.execute();
    }
}
