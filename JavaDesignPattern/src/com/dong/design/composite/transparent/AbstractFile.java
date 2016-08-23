package com.dong.design.composite.transparent;

public interface AbstractFile {

	public void addFile(AbstractFile file);

	public void removeFile(AbstractFile file);

	public AbstractFile getFile(int i);

	public void killFile();

}
