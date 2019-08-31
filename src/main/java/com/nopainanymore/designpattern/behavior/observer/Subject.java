package com.nopainanymore.designpattern.behavior.observer;

/**
 * design-pattern: Subject
 *
 * @author nopainanymore
 * @version 2019-07-11 22:43
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
