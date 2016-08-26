package com.dong.design.command;

import java.util.ArrayList;
import java.util.List;

public class CommandQueen {

	private List<Command> list;

	public CommandQueen() {
		list = new ArrayList<>();
	}

	public void addCommand(Command command) {
		list.add(command);
	}

	public void removeCommand(Command command) {
		list.remove(command);
	}

	public Command getCommand(int i) {
		return list.get(i);
	}

	public void execute() {
		for (Command command : list) {
			command.execute();
		}
	}
}
