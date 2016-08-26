package com.dong.design.command;

public class User {

	public static void main(String[] args) {
		System.out.println("common command test");
		Command createCommand = new CreateCommand();
		MenuItem menuItem = new MenuItem(createCommand);
		Menu menu = new Menu();
		menu.addItem(menuItem);
		System.out.println("发送创建命令");
		menuItem.onClick();
		System.out.println("发送打开命令");
		OpenCommand openCommand = new OpenCommand();
		menuItem.setCommand(openCommand);
		menuItem.onClick();
		System.out.println("发送编辑命令");
		EditCommand editCommand = new EditCommand();
		menuItem.setCommand(editCommand);
		menuItem.onClick();

		System.out.println("命令队列");
		CommandQueen commandQueen = new CommandQueen();
		commandQueen.addCommand(createCommand);
		commandQueen.addCommand(openCommand);
		commandQueen.addCommand(editCommand);
		menuItem.setCommandQueen(commandQueen);
		menuItem.onCommandsClick();

		System.out.println("宏命令");
		MacroCommand macroCommand = new MacroCommand();
		macroCommand.addCommand(createCommand);
		macroCommand.addCommand(openCommand);
		macroCommand.addCommand(editCommand);
		menuItem.setCommand(macroCommand);
		menuItem.onClick();

		System.out.println("命令模式回滚");
		Compute compute = new Compute();
		compute.setComputeCommand(new AddCommand());
		int sum = 0;
		sum = compute.execute(10);
		System.out.println("sum:" + sum);
		sum = compute.execute(5);
		System.out.println("sum:" + sum);
		sum = compute.execute(10);
		System.out.println("sum:" + sum);
		sum = compute.undo();
		System.out.println("sum:" + sum);
		sum = compute.undo();
		System.out.println("sum:" + sum);
	}

}
