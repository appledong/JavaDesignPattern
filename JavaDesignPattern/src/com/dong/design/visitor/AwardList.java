package com.dong.design.visitor;

import java.util.ArrayList;
import java.util.List;

public class AwardList {

	public List<Award> list;

	public AwardList() {
		list = new ArrayList<>();
	}

	public void addAward(Award award) {
		list.add(award);
	}

	public void award(Visitor visitor) {
		for (Award award : list) {
			award.accept(visitor);
		}
	}
}
