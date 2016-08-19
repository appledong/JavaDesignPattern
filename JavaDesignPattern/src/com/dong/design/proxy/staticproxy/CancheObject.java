package com.dong.design.proxy.staticproxy;

import java.util.ArrayList;
import java.util.List;

public class CancheObject {

	public List<String> getStrings() {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 15; i++) {
			list.add("haha" + i);
		}
		return list;
	}

}
