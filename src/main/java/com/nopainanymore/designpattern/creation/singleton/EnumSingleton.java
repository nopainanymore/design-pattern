package com.nopainanymore.designpattern.creation.singleton;

/**
 * design-pattern: EnumSingleton
 *
 * @author nopainanymore
 * @version 2019-07-16 22:52
 */
public enum  EnumSingleton {

    INSTANCE;

    public static void main(String[] args) {
        // how to use
        EnumSingleton singleton = EnumSingleton.INSTANCE;

    }

}
