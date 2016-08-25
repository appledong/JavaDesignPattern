package com.dong.design.share;

import com.dong.design.share.ShareFactory.FileType;

public class User {

	public static void main(String[] args) {
		System.out.println("享元模式测试");
		ShareFactory shareFactory = ShareFactory.getInstanse();
		File file1 = shareFactory.getShareFile(FileType.pic, "美丽");
		File file2 = shareFactory.getShareFile(FileType.pic, "美丽");
		System.out.println("file1： " + file1 + " file2:" + file2);

		System.out.println("享元模式非共享");
		File file5 = shareFactory.getUnShareFile(FileType.video, "aoao");
		File file6 = shareFactory.getUnShareFile(FileType.video, "aoao");
		System.out.println("file5： " + file5 + " file6:" + file6);

		System.out.println("享元模式外在状态的设置");
		File file3 = shareFactory.getShareFile(FileType.gif, "haha");
		File file4 = shareFactory.getShareFile(FileType.gif, "haha");
		file3.display(new Coordinates(5, 9), new Size(100, 78));
		file3.display(new Coordinates(17, 29), new Size(68, 98));

		System.out.println("复合享元模式的使用");
		Flord flord = new Flord("common");
		flord.add(file1);
		flord.add(file2);
		flord.add(file3);
		flord.add(file4);
		flord.display(new Coordinates(6, 39), new Size(109, 89));
	}
}
