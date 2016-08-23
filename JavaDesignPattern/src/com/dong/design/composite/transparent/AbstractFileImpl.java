package com.dong.design.composite.transparent;

public abstract class AbstractFileImpl implements AbstractFile {

	@Override
	public void addFile(AbstractFile file) {
		System.out.println("文件不支持添加");
	}

	@Override
	public void removeFile(AbstractFile file) {
		System.out.println("文件不支持移除");
	}

	@Override
	public AbstractFile getFile(int i) {
		System.out.println("文件不支持该方法");
		return null;
	}

}
