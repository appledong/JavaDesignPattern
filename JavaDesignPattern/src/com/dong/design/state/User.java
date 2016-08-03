package com.dong.design.state;

public class User {

	public static void main(String[] args) {
		StateContext stateContext = new StateContext();
		stateContext.setLiftState(stateContext.closedState);
		stateContext.open();
		stateContext.closed();
		stateContext.run();
		stateContext.stop();
		stateContext.open();
	}

}
