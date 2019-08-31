package com.nopainanymore.designpattern.creation.singleton;

/**
 * design-pattern: Hunger
 *
 * @author nopainanymore
 * @version 2019-07-16 22:46
 * thread safe
 */
public class Hunger {

    private static Hunger hunger = new Hunger();

    private Hunger(){
    }

    public static Hunger getInstance(){
        return hunger;
    }

}
