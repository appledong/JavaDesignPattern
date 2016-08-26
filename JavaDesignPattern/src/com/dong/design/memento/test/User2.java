package com.dong.design.memento.test;

import com.dong.design.memento.ChessMan;
import com.dong.design.memento.ChessManMementListCaretaker;

/***
 * 存在问题：没有处理撤销重做等的分支问题
 * @author dong
 *
 */
public class User2 {

	private static int index = -1;// 索引：记录当前棋走的步数用来回滚和撤销回滚

	public static void display(ChessMan chess) {
		System.out.println("棋子" + chess.getName() + "当前位置为：" + "第"
				+ chess.getX() + "行" + "第" + chess.getY() + "列。");
	}

	public static void play(ChessMan chessMan, ChessManMementListCaretaker mc) {
		mc.setChessManMemento(chessMan.save());
		index++;
		display(chessMan);
	}

	public static void undo(ChessMan chessMan, ChessManMementListCaretaker mc) {
		System.out.println("悔棋");
		index--;
		if (mc.getMenChessManMemento(index) != null) {
			chessMan.restoreChessManMemento(mc.getMenChessManMemento(index));
		}
		display(chessMan);
	}

	public static void reUndo(ChessMan chessMan, ChessManMementListCaretaker mc) {
		System.out.println("撤销悔棋");
		index++;
		if (mc.getMenChessManMemento(index) != null) {
			chessMan.restoreChessManMemento(mc.getMenChessManMemento(index));
		}
		display(chessMan);
	}

	public static void main(String[] args) {
		ChessManMementListCaretaker listCaretaker = new ChessManMementListCaretaker();
		ChessMan chessMan = new ChessMan("马", 0, 0);
		play(chessMan, listCaretaker);
		chessMan.setX(2);
		play(chessMan, listCaretaker);
		chessMan.setY(3);
		play(chessMan, listCaretaker);
		undo(chessMan, listCaretaker);
		reUndo(chessMan, listCaretaker);
	}

}
