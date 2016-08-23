package com.dong.design.composite.safe;

public class TextFile implements AbstractFile {

	private String filename;

	public TextFile(String name) {
		filename = name;
	}

	@Override
	public void killFile() {
		System.out.println("文本文件" + filename + "经过杀毒");
	}

}
