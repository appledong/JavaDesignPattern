package com.dong.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录集合：实现多次撤销
 * 
 * @author dong
 *
 */
public class ChessManMementListCaretaker {

	private List<ChessManMemento> list;

	public ChessManMementListCaretaker() {
		list = new ArrayList<ChessManMemento>();
	}

	public ChessManMemento getMenChessManMemento(int i) {
		if (i < 0) {
			System.out.println("起步不能悔棋");
			return null;
		}
		return list.get(i);
	}

	public void setChessManMemento(ChessManMemento chessManMemento) {
		list.add(chessManMemento);
	}

}
