package com.dong.design.visitor;

public class TeachAwardVisitor extends Visitor {

	@Override
	public void visiteStudent(Award award) {
		int num = award.getTeachNum();
		if (num >= 90) {
			System.out.println(award.getName() + "同学，恭喜你中成绩奖了！");
		} else {
			System.out.println(award.getName() + "同学未中奖");
		}
	}

	@Override
	public void visiteTeacher(Award award) {
		int num = award.getTeachNum();
		if (num >= 90) {
			System.out.println(award.getName() + "老师，恭喜你中教学奖了！");
		} else {
			System.out.println(award.getName() + "老师未中奖");
		}
	}

}
