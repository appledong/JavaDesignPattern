package com.dong.design.state;

public class AddNState extends LiftState {

	@Override
	public void open() {
		System.out.println("新添状态，打开电梯");
		stateContext.setLiftState(stateContext.openState);
		stateContext.open();
	}

	@Override
	public void closed() {
		System.out.println("新添状态，关闭电梯");
		stateContext.setLiftState(stateContext.openState);
		stateContext.open();
	}

	@Override
	public void run() {
		System.out.println("新添状态，运行电梯");
		stateContext.setLiftState(stateContext.openState);
		stateContext.open();
	}

	@Override
	public void stop() {
		System.out.println("新添状态，停止电梯");
		stateContext.setLiftState(stateContext.openState);
		stateContext.open();
	}

}
