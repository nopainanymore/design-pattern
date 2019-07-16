package com.nopainanymore.designpattern.constructure.proxy.cglib;

/**
 * design-pattern: CGLibUsage
 *
 * @author NoPainAnymore
 * @date 2019-05-04 17:53
 */
public class CGLibUsage {


    public static void main(String[] args) {
        EClass eClass = new EClass();
        CGLibProxy proxy = new CGLibProxy(eClass);
        proxy.createProxy().execute();
    }
}
