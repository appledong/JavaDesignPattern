package com.dong.design.command;

public class AddCommand implements ComputeCommand {

	private AddOper addoper;

	private int lastValue;

	public AddCommand() {
		addoper = new AddOper();
	}

	@Override
	public int execute(int value) {
		lastValue = value;
		return addoper.add(value);
	}

	@Override
	public int undo() {
		return addoper.add(-lastValue);
	}
}
