package com.dong.design.visitor;

public class Teacher extends Award {

	public Teacher(String name, int paperNum, int teachNum) {
		super(name, paperNum, teachNum);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visiteTeacher(this);
	}

}
