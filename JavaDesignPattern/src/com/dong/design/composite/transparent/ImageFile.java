package com.dong.design.composite.transparent;

public class ImageFile extends AbstractFileImpl {

	private String filename;

	public ImageFile(String name) {
		filename = name;
	}

	@Override
	public void killFile() {
		System.out.println("图片文件" + filename + "经过杀毒");
	}

}
