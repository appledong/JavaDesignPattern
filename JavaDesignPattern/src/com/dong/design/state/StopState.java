package com.dong.design.state;

public class StopState extends LiftState {

	@Override
	public void open() {
		System.out.println("停止状态，开启电梯门");
		stateContext.setLiftState(stateContext.openState);
		stateContext.open();
	}

	@Override
	public void closed() {
		System.out.println("停止状态，关闭电梯门");
		stateContext.setLiftState(stateContext.closedState);
		stateContext.closed();
	}

	@Override
	public void run() {
		System.out.println("停止状态，启动电梯");
		stateContext.setLiftState(stateContext.runState);
		stateContext.run();
	}

	@Override
	public void stop() {
		System.out.println("停止状态，已经停了电梯");
	}

}
