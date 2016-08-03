package com.dong.design.state;

public class StateContext {

	public OpenState openState;
	public ClosedState closedState;
	public RunState runState;
	public StopState stopState;

	public StateContext() {
		openState = new OpenState();
		openState.setStateContext(this);
		closedState = new ClosedState();
		closedState.setStateContext(this);
		runState = new RunState();
		runState.setStateContext(this);
		stopState = new StopState();
		stopState.setStateContext(this);
	}

	private LiftState liftState;

	public LiftState getLiftState() {
		return liftState;
	}

	public void setLiftState(LiftState liftState) {
		this.liftState = liftState;
	}

	public void open() {
		liftState.open();
	}

	public void closed() {
		liftState.closed();
	}

	public void run() {
		liftState.run();
	}

	public void stop() {
		liftState.stop();
	}

}
