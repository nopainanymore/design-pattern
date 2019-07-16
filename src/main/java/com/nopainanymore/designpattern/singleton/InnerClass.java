package com.nopainanymore.designpattern.singleton;

/**
 * design-pattern: InnerClass
 *
 * @author NoPainAnymore
 * @date 2019-07-16 22:49
 */
public class InnerClass {

    private InnerClass() {
    }

    private static class InstanceHolder {
        private static final InnerClass INSTANCE = new InnerClass();
    }

    public InnerClass getInstance() {
        return InstanceHolder.INSTANCE;
    }


}
