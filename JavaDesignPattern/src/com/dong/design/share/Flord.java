package com.dong.design.share;

import java.util.ArrayList;
import java.util.List;

public class Flord extends File {

	private List<File> list;

	public Flord(String name) {
		super(name);
		list = new ArrayList<>();
	}

	public void add(File file) {
		list.add(file);
	}

	public void remove(File file) {
		list.remove(file);
	}

	@Override
	public void display(Coordinates coordinates, Size size) {
		for (File file : list) {
			file.display(coordinates, size);
		}
	}

}
