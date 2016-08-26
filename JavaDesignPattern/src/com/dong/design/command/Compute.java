package com.dong.design.command;

public class Compute {

	private ComputeCommand computeCommand;

	public void setComputeCommand(ComputeCommand computeCommand) {
		this.computeCommand = computeCommand;
	}

	public int execute(int value) {
		return computeCommand.execute(value);
	}

	public int undo() {
		return computeCommand.undo();
	}
}
