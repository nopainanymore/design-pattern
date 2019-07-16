package com.nopainanymore.designpattern.singleton;

/**
 * design-pattern: Lazy
 *
 * @author NoPainAnymore
 * @date 2019-07-16 22:44
 * thread unsafe
 */
public class Lazy {

    private static Lazy lazy;

    private Lazy(){
    }

    public Lazy getInstance(){
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

}
