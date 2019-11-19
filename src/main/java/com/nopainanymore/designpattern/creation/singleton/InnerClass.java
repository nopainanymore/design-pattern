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

    // 当getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance，内部类SingletonHolder类得到初始化；
    // 而这个类在装载并被初始化的时候，会初始化它的静态域，从而创建Singleton的实例，
    // 由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。
    // 多线程并发时，JVM会保证只有一个线程执行类对初始化

    private static class InstanceHolder {
        private static final InnerClass INSTANCE = new InnerClass();
    }

    public static InnerClass getInstance() {
        return InstanceHolder.INSTANCE;
    }

}
