package com.nopainanymore.designpattern.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: LeaderApprovalState
 *
 * @author nopainanymore
 * @version 2019-12-11 10:46
 */
@Slf4j
public class LeaderApprovalState extends State {

    private static final String LEADER_STATE = "leaderApproval";

    public static LeaderApprovalState of() {
        return new LeaderApprovalState();
    }

    @Override
    public void handle() {
        this.stateName = LEADER_STATE;
        this.opinion = Math.random() < 0.8;
        log.info("LeaderApprovalState- handle- stateName:{}, opinion:{}", this.stateName, this.opinion);
        if (opinion) {
            this.process.setState(new HumanResourceApprovalState());
        } else {
            this.process.setState(EndState.ofFalse());
        }
    }
}
