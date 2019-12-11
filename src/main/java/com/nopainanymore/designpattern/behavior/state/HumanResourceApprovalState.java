package com.nopainanymore.designpattern.behavior.state;

import lombok.extern.slf4j.Slf4j;

/**
 * design-pattern: HumanResourceApprovalState
 *
 * @author nopainanymore
 * @version 2019-12-11 10:47
 */
@Slf4j
public class HumanResourceApprovalState extends State {

    private static final String HUMAN_RESOURCE_STATE = "humanResourceApproval";

    public static HumanResourceApprovalState of() {
        return new HumanResourceApprovalState();
    }

    @Override
    public void handle() {
        this.stateName = HUMAN_RESOURCE_STATE;
        this.opinion = Math.random() < 0.8;
        log.info("HumanResourceApprovalState- handle- stateName:{}, opinion:{}", HUMAN_RESOURCE_STATE, opinion);
        this.process.setState(EndState.of(opinion));
    }
}
