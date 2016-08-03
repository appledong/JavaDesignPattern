package com.dong.design.state;

public class OpenState extends LiftState {

	@Override
	public void open() {
		System.out.println("打开了电梯门...");
	}

	@Override
	public void closed() {
		System.out.println("开放状态关闭电梯门");
		stateContext.setLiftState(stateContext.closedState);
		stateContext.closed();
	}

	@Override
	public void run() {
		System.out.println("开门状态，不能上下走");
	}

	@Override
	public void stop() {
		System.out.println("开门状态，已经停止");
	}

}
