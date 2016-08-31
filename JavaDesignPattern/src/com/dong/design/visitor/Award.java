package com.dong.design.visitor;

public abstract class Award {

	private String name;
	private int paperNum;
	private int teachNum;

	public Award(String name, int paperNum, int teachNum) {
		super();
		this.name = name;
		this.paperNum = paperNum;
		this.teachNum = teachNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPaperNum() {
		return paperNum;
	}

	public void setPaperNum(int paperNum) {
		this.paperNum = paperNum;
	}

	public int getTeachNum() {
		return teachNum;
	}

	public void setTeachNum(int teachNum) {
		this.teachNum = teachNum;
	}

	public abstract void accept(Visitor visitor);

}
