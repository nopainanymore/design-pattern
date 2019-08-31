package com.nopainanymore.designpattern.behavior.chainofresponsibility.pure;

/**
 * design-pattern: AbstractHandler
 *
 * @author nopainanymore
 * @version 2019-07-17 22:54
 */
public abstract class AbstractHandler {

    public enum Condition{
        A,B
    }

    protected AbstractHandler nextHandler;

    public abstract void handle(Condition condition, String request);

    public AbstractHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
