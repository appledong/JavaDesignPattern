package com.dong.design.composite.transparent;

public class TextFile extends AbstractFileImpl {

	private String filename;

	public TextFile(String name) {
		filename = name;
	}

	@Override
	public void killFile() {
		System.out.println("文本文件" + filename + "经过杀毒");
	}

}
