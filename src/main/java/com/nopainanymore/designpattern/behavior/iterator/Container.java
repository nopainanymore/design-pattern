package com.nopainanymore.designpattern.behavior.iterator;

/**
 * design-pattern: Container
 *
 * @author nopainanymore
 * @version 2019-11-11 15:17
 */
public interface Container<E> {

    Iterator<E> getIterator();

}
