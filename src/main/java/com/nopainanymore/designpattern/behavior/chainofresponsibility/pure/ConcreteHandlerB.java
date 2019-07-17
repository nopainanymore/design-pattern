package com.nopainanymore.designpattern.behavior.chainofresponsibility.pure;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: ConcreteHandlerB
 *
 * @author NoPainAnymore
 * @date 2019-07-17 22:57
 */
@Slf4j
public class ConcreteHandlerB extends AbstractHandler {

    public ConcreteHandlerB(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Condition condition, String request) {
        if (condition.equals(Condition.B)) {
            log.info("ConcreteHandlerB- handle request:{}", request);
            return;
        }
        if (nextHandler != null) {
            nextHandler.handle(condition, request);
        }
    }
}
