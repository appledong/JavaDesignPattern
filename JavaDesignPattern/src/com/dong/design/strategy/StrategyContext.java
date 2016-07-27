package com.dong.design.strategy;

public class StrategyContext {

	private GoOutStrategy goOutStrategy;

	public StrategyContext(GoOutStrategy strategy) {
		goOutStrategy = strategy;
	}

	public void go() {
		goOutStrategy.goOut();
	}

}
