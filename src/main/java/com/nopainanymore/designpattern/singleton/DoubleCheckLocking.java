package com.nopainanymore.designpattern.singleton;

/**
 * design-pattern: DoubleCheckLocking
 *
 * @author NoPainAnymore
 * @date 2019-07-16 22:41
 * thread safe
 */
public class DoubleCheckLocking {

    private volatile static DoubleCheckLocking doubleCheckLocking;

    private DoubleCheckLocking() {
    }

    public DoubleCheckLocking getInstance() {
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
