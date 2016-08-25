package com.dong.design.share;

public class VideoFile extends File {

	public VideoFile(String name) {
		super(name);
	}

	@Override
	public void display(Coordinates coordinates, Size size) {
		System.out.println("动画大小是：width：" + size.width + " height:"
				+ size.height + "展示位置：x=" + coordinates.x + "y="
				+ coordinates.y);
	}

}
