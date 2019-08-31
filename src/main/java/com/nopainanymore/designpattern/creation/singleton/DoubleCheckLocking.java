package com.nopainanymore.designpattern.creation.singleton;

/**
 * design-pattern: DoubleCheckLocking
 *
 * @author nopainanymore
 * @version 2019-07-16 22:41
 * thread safe
 */
public class DoubleCheckLocking {

    private volatile static DoubleCheckLocking doubleCheckLocking;

    private DoubleCheckLocking() {
    }

    public static DoubleCheckLocking getInstance() {
        if (doubleCheckLocking == null) {
            synchronized (DoubleCheckLocking.class) {
                if (doubleCheckLocking == null) {
                    doubleCheckLocking = new DoubleCheckLocking();
                }
            }
        }
        return doubleCheckLocking;
    }

}
