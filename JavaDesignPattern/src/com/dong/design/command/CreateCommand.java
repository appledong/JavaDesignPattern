package com.dong.design.command;

public class CreateCommand implements Command {

	private CreateBoardScreen createBoardScreen;

	public CreateCommand() {
		createBoardScreen = new CreateBoardScreen();
	}

	@Override
	public void execute() {
		createBoardScreen.create();
	}

}
