package com.dong.design.strategy;

public class PlanGoOutStrategy implements GoOutStrategy {
	@Override
	public void goOut() {
		System.out.println("乘坐飞机出行");
	}
}
