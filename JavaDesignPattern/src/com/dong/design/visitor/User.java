package com.dong.design.visitor;

public class User {

	public static void main(String[] args) {
		Award xiaoming = new Student("小明", 1, 68);
		Award xiaohong = new Student("xiaohong", 5, 65);
		Award xiaonan = new Student("xiaonan", 1, 97);
		Award laowang = new Teacher("laowang", 7, 76);
		Award laoli = new Teacher("老李", 15, 86);
		Award laobai = new Teacher("老白", 7, 98);
		AwardList awardList = new AwardList();
		awardList.addAward(laobai);
		awardList.addAward(laoli);
		awardList.addAward(laowang);
		awardList.addAward(xiaonan);
		awardList.addAward(xiaohong);
		awardList.addAward(xiaoming);
		awardList.award(new PaperAwardVisitor());
		awardList.award(new TeachAwardVisitor());
	}

}
