package com.dong.design.composite.safe;

import java.util.ArrayList;
import java.util.List;

public class FlordFile implements AbstractFile {

	private String filename;
	private List<AbstractFile> list;

	public FlordFile(String name) {
		filename = name;
		list = new ArrayList<>();
	}

	public void addFile(AbstractFile file) {
		list.add(file);
	}

	public void removeFile(AbstractFile file) {
		list.remove(file);
	}

	public AbstractFile getFile(int i) {
		return list.get(i);
	}

	public void killFile() {
		System.out.println("文件夹" + filename + "杀毒");
		for (AbstractFile abstractFile : list) {
			abstractFile.killFile();
		}
	}

}
