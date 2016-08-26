package com.dong.design.memento;

public class ChessMan {

	public String name;

	public int x;
	public int y;

	public ChessMan(String name, int x, int y) {
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

	/***
	 * 虽然返回了备忘录对象，但是由于权限是默认的，异包可以作为参数使用，但是不能够持有访问对象
	 * @return
	 */
	public ChessManMemento save() {
		return new ChessManMemento(name, x, y);
	}

	public void restoreChessManMemento(ChessManMemento chessManMemento) {
		name = chessManMemento.name;
		x = chessManMemento.x;
		y = chessManMemento.y;
	}

}
