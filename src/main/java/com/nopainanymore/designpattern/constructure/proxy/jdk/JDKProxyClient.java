package com.nopainanymore.designpattern.constructure.proxy.jdk;

/**
 * design-pattern: JDKProxyClient
 *
 * @author nopainanymore
 * @version 2019-05-04 16:48
 */
public class JDKProxyClient {

    public static void main(String[] args) {
        EClass eClass = new EClass();
        JDKProxy proxy = new JDKProxy(eClass);
        proxy.createProxy().execute();

    }
}
