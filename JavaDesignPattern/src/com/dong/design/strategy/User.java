package com.dong.design.strategy;

public class User {

	public static void main(String[] args) {

		int i = 0;
		while (i < 2) {
			GoOutStrategy goOutStrategy = null;
			if (i == 0) {
				goOutStrategy = new BikeGoOutStrategy();
			} else {
				goOutStrategy = new TrainGoOutStrategy();
			}
			StrategyContext strategyContext = new StrategyContext(goOutStrategy);
			strategyContext.go();
			i++;
		}

	}

}
