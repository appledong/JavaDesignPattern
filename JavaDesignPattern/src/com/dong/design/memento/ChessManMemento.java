package com.dong.design.memento;

/**
 * 注意备忘录类的封装，默认同包使用
 * @author dong
 *
 */
class ChessManMemento {
	public String name;

	public int x;
	public int y;

	public ChessManMemento(String name, int x, int y) {
		super();
		this.name = name;
		this.x = x;
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
