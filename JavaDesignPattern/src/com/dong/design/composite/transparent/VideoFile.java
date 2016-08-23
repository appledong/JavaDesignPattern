package com.dong.design.composite.transparent;

public class VideoFile extends AbstractFileImpl {

	private String filename;

	public VideoFile(String name) {
		filename = name;
	}

	@Override
	public void killFile() {
		System.out.println("视频文件" + filename + "经过杀毒");
	}

}
