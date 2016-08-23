package com.dong.design.composite.transparent;

public class User {

	public static void main(String[] args) {
		System.out.println("透明组合模式测试");

		AbstractFile flordFile1 = new FlordFile("pic");
		AbstractFile flordFile2 = new FlordFile("text");
		AbstractFile flordFile3 = new FlordFile("video");
		AbstractFile flordFile4 = new FlordFile("common");

		flordFile4.addFile(flordFile1);
		flordFile4.addFile(flordFile2);
		flordFile4.addFile(flordFile3);

		AbstractFile zhiling = new ImageFile("zhiling");
		AbstractFile bingbing = new ImageFile("bingbing");
		flordFile1.addFile(bingbing);
		flordFile1.addFile(zhiling);
		AbstractFile follow1 = new TextFile("zhiling");
		AbstractFile follow2 = new TextFile("bingbing");
		flordFile2.addFile(follow1);
		flordFile2.addFile(follow2);
		AbstractFile video1 = new VideoFile("zhiling");
		AbstractFile video2 = new VideoFile("bingbing");
		flordFile3.addFile(video1);
		flordFile3.addFile(video2);
		flordFile4.killFile();

	}

}
