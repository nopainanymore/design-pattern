package com.nopainanymore.designpattern.constructure.flyweight;

/**
 * design-pattern: Client
 *
 * @author nopainanymore
 * @version 2019-09-22 21:12
 */
public class Client {

    public static void main(String[] args) {
        FlyWeight first = FlyWeightFactory.getFlyWeight("first");
        first.setChangeable("1");
        first.getLogUnchangeable();
    }
}
