package com.dong.design.share;

public class GifFile extends File {

	public GifFile(String name) {
		super(name);
	}

	@Override
	public void display(Coordinates coordinates, Size size) {
		System.out.println("图片大小是：width：" + size.width + " height:"
				+ size.height + "展示位置：x=" + coordinates.x + "y="
				+ coordinates.y);
	}

}
