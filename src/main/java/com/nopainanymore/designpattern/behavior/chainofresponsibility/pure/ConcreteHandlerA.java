package com.nopainanymore.designpattern.behavior.chainofresponsibility.pure;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: ConcreteHandlerA
 *
 * @author NoPainAnymore
 * @date 2019-07-17 22:56
 */
@Slf4j
public class ConcreteHandlerA extends AbstractHandler {

    public ConcreteHandlerA(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Condition condition, String request) {
        if (condition.equals(Condition.A)) {
            log.info("ConcreteHandlerA- handle request:{}", request);
            return;
        }
        if (nextHandler != null) {
            nextHandler.handle(condition, request);
        }
    }


}
