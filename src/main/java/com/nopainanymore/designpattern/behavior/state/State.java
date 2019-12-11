package com.nopainanymore.designpattern.behavior.state;

/**
 * design-pattern: State
 *
 * @author nopainanymore
 * @version 2019-12-11 10:30
 */
public abstract class State {

    protected String stateName;

    protected Boolean opinion;

    protected Process process;

    public abstract void handle();

    public void setProcess(Process process) {
        this.process = process;
    }
}
