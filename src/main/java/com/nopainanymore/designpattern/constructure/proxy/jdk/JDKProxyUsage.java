package com.nopainanymore.designpattern.constructure.proxy.jdk;

/**
 * design-pattern: JDKProxyUsage
 *
 * @author nopainanymore
 * @version 2019-05-04 16:48
 */
public class JDKProxyUsage {

    public static void main(String[] args) {
        EClass eClass = new EClass();
        JDKProxy proxy = new JDKProxy(eClass);
        proxy.createProxy().execute();

    }
}
