package com.nopainanymore.designpattern.singleton;

/**
 * design-pattern: EnumSingleton
 *
 * @author NoPainAnymore
 * @date 2019-07-16 22:52
 */
public enum  EnumSingleton {

    INSTANCE;

    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {
        // how to use
        EnumSingleton singleton = EnumSingleton.INSTANCE;

    }

}
