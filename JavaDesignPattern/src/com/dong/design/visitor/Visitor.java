package com.dong.design.visitor;

public abstract class Visitor {
	public abstract void visiteStudent(Award award);

	public abstract void visiteTeacher(Award award);

//	public abstract void award(AwardList awardList);
}
