package com.dong.design.share;

public abstract class File {

	private String fileName;

	public File(String name) {
		fileName = name;
	}

	public abstract void display(Coordinates coordinates, Size size);

}
