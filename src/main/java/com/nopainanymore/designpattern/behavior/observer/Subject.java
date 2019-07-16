package com.nopainanymore.designpattern.behavior.observer;

/**
 * design-pattern: Subject
 *
 * @author NoPainAnymore
 * @date 2019-07-11 22:43
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
