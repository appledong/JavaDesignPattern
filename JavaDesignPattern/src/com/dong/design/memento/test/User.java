package com.dong.design.memento.test;

import com.dong.design.memento.ChessMan;
import com.dong.design.memento.ChessManMementCaretaker;

public class User {

	public static void display(ChessMan chess) {
		System.out.println("棋子" + chess.getName() + "当前位置为：" + "第"
				+ chess.getX() + "行" + "第" + chess.getY() + "列。");
	}

	public static void main(String[] args) {
		ChessManMementCaretaker taker = new ChessManMementCaretaker();
		ChessMan chessMan = new ChessMan("车", 1, 1);
		display(chessMan);
		taker.setChessManMemento(chessMan.save());// 保存状态
		chessMan.setX(5);
		display(chessMan);
		taker.setChessManMemento(chessMan.save());// 保存状态
		chessMan.setY(2);
		display(chessMan);
		taker.setChessManMemento(chessMan.save());// 保存状态
		chessMan.setY(6);
		display(chessMan);
		System.out.println("回滚");
		chessMan.restoreChessManMemento(taker.getMenChessManMemento());
		display(chessMan);
	}

}
