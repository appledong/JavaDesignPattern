package com.dong.design.strategy;

public class TrainGoOutStrategy implements GoOutStrategy {
	@Override
	public void goOut() {
		System.out.println("乘坐火车出行");
	}
}
