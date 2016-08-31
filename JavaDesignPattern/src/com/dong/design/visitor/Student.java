package com.dong.design.visitor;

public class Student extends Award {

	public Student(String name, int paperNum, int teachNum) {
		super(name, paperNum, teachNum);
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visiteStudent(this);
	}

}
