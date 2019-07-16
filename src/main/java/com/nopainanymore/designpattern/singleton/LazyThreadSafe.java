package com.nopainanymore.designpattern.singleton;

/**
 * design-pattern: LazyThreadSafe
 *
 * @author NoPainAnymore
 * @date 2019-07-16 22:48
 */
public class LazyThreadSafe {

    private static LazyThreadSafe lazyThreadSafe;

    private LazyThreadSafe(){
    }

    public static synchronized LazyThreadSafe getInstance(){
        if (lazyThreadSafe == null) {
            lazyThreadSafe = new LazyThreadSafe();
        }
        return lazyThreadSafe;
    }
}
