package com.dong.design.command;

public class AddOper {

	private int sum;

	public int add(int value) {
		sum = sum + value;
		return sum;
	}

}
