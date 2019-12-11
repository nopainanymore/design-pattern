package com.nopainanymore.designpattern.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: StartState
 *
 * @author nopainanymore
 * @version 2019-12-11 10:53
 */
@Slf4j
public class StartState extends State {

    private static final String START_STATE = "startState";

    public static StartState of() {
        return new StartState();
    }

    @Override
    public void handle() {
        this.stateName = START_STATE;
        this.opinion = true;
        log.info("StartState- handle- stateName: {}, opinion:{}", this.stateName, this.opinion);
        this.process.setState(LeaderApprovalState.of());
    }
}
