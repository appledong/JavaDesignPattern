package com.dong.design.state;

public class ClosedState extends LiftState {

	@Override
	public void open() {
		System.out.println("关门状态，打开电梯门");
		stateContext.setLiftState(stateContext.openState);
		stateContext.open();
	}

	@Override
	public void closed() {
		System.out.println("关闭了电梯门");
	}

	@Override
	public void run() {
		System.out.println("关闭状态，电梯启动");
		stateContext.setLiftState(stateContext.runState);
		stateContext.run();
	}

	@Override
	public void stop() {
		System.out.println("关闭状态，停止电梯");
		stateContext.setLiftState(stateContext.stopState);
		stateContext.stop();
	}
}
