package com.dong.design.command;

public interface ComputeCommand {

	public int execute(int value);

	public int undo();

}
