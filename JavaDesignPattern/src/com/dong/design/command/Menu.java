package com.dong.design.command;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<MenuItem> list;

	public Menu() {
		list = new ArrayList<>();
	}

	public void addItem(MenuItem menuItem) {
		list.add(menuItem);
	}

}
