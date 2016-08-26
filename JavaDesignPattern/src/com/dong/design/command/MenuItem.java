package com.dong.design.command;

public class MenuItem {

	private Command command;

	private CommandQueen commandQueen;

	public MenuItem(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void setCommandQueen(CommandQueen commandQueen) {
		this.commandQueen = commandQueen;
	}

	public void onClick() {
		command.execute();
	}

	public void onCommandsClick() {
		commandQueen.execute();
	}

}
