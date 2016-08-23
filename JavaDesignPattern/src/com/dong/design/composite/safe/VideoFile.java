package com.dong.design.composite.safe;

public class VideoFile implements AbstractFile {

	private String filename;

	public VideoFile(String name) {
		filename = name;
	}

	@Override
	public void killFile() {
		System.out.println("视频文件" + filename + "经过杀毒");
	}

}
