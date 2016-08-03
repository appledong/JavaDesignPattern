package com.dong.design.state;

public abstract class LiftState {

	public StateContext stateContext;

	public void setStateContext(StateContext stateContext) {
		this.stateContext = stateContext;
	}

	public abstract void open();

	public abstract void closed();

	public abstract void run();

	public abstract void stop();
}
