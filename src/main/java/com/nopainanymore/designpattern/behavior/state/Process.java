package com.nopainanymore.designpattern.behavior.state;

/**
 * design-pattern: Process
 *
 * @author nopainanymore
 * @version 2019-12-11 10:30
 */
public class Process {

    private Long processId;

    private String processTitle;

    private State state;

    public Process(Long processId, String processTitle) {
        this.processId = processId;
        this.processTitle = processTitle;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        state.setProcess(this);
        this.state = state;
        this.getState().handle();
    }
}
