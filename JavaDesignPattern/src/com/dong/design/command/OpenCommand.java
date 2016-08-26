package com.dong.design.command;

public class OpenCommand implements Command {

	private OpenBoardScreen openBoardScreen;

	public OpenCommand() {
		openBoardScreen = new OpenBoardScreen();
	}

	@Override
	public void execute() {
		openBoardScreen.open();
	}

}
