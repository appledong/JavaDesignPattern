package com.dong.design.command;

/**
 * 添加了命令模式的日志记录功能
 * 
 * @author dong
 *
 */
public abstract class AbstractCommand implements Command {

	@Override
	public void execute() {
		log();
		executeImpl();
	}

	/**
	 * 记录日志
	 */
	private void log() {

	}

	public abstract void executeImpl();

}
