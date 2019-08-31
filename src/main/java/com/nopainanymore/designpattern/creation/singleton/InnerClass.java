package com.nopainanymore.designpattern.creation.singleton;

/**
 * design-pattern: InnerClass
 *
 * @author nopainanymore
 * @version 2019-07-16 22:49
 */
public class InnerClass {

    private InnerClass() {
    }

    private static class InstanceHolder {
        private static final InnerClass INSTANCE = new InnerClass();
    }

    public static InnerClass getInstance() {
        return InstanceHolder.INSTANCE;
    }


}
