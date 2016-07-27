package com.dong.design.strategy;

public class BikeGoOutStrategy implements GoOutStrategy {

	@Override
	public void goOut() {
		System.out.println("乘坐自行车出行");
	}

}
