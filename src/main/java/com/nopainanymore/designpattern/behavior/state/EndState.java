package com.nopainanymore.designpattern.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: EndState
 *
 * @author nopainanymore
 * @version 2019-12-11 10:53
 */
@Slf4j
public class EndState extends State {

    private static final String END_STATE = "endState";

    public static EndState of(Boolean opinion) {
        EndState endState = new EndState();
        endState.opinion = opinion;
        return endState;
    }

    public static EndState ofFalse() {
        EndState endState = new EndState();
        endState.opinion = false;
        return endState;
    }

    @Override
    public void handle() {
        this.stateName = END_STATE;
        log.info("EndState- handle- stateName:{}, opinion:{}", this.stateName, this.opinion);
    }
}
