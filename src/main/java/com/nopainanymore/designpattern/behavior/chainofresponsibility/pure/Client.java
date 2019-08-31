package com.nopainanymore.designpattern.behavior.chainofresponsibility.pure;

/**
 * design-pattern: Client
 *
 * @author nopainanymore
 * @version 2019-07-17 23:00
 */
public class Client {

    private static AbstractHandler handlerChain;

    private static void init() {
        AbstractHandler handlerA = new ConcreteHandlerA(null);
        handlerChain = new ConcreteHandlerB(handlerA);
    }

    public static void main(String[] args) {
        init();
        handlerChain.handle(AbstractHandler.Condition.A, "requestA");
        handlerChain.handle(AbstractHandler.Condition.B, "requestB");
    }
}
