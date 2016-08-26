package com.dong.design.command;

public class EditCommand implements Command {

	private EditBoardScreen editBoardScreen;

	public EditCommand() {
		editBoardScreen = new EditBoardScreen();
	}

	@Override
	public void execute() {
		editBoardScreen.edit();
	}

}
