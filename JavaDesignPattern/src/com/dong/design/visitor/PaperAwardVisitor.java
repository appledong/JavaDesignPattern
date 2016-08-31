package com.dong.design.visitor;

/**
 * 论文评奖
 * 
 * @author dong
 *
 */
public class PaperAwardVisitor extends Visitor {

	@Override
	public void visiteStudent(Award award) {
		int papernum = award.getPaperNum();
		if (papernum >= 2) {
			System.out.println(award.getName() + "同学，恭喜你中论文奖了！");
		} else {
			System.out.println(award.getName() + "同学未中奖");
		}
	}

	@Override
	public void visiteTeacher(Award award) {
		int papernum = award.getPaperNum();
		if (papernum >= 10) {
			System.out.println(award.getName() + "老师，恭喜你中论文奖了！");
		} else {
			System.out.println(award.getName() + "老师未中奖");
		}
	}

}
