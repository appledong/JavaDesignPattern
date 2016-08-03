package com.dong.design.state;

public class RunState extends LiftState {

	@Override
	public void open() {
		System.out.println("运行状态不能开门");
	}

	@Override
	public void closed() {
		System.out.println("运行状态，电梯门是关闭的");
	}

	@Override
	public void run() {
		System.out.println("运行状态，启动运行");
	}

	@Override
	public void stop() {
		System.out.println("运行状态，停掉了电梯");
		stateContext.setLiftState(stateContext.stopState);
		stateContext.stop();
	}

}
