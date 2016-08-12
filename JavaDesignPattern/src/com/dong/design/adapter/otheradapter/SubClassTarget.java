package com.dong.design.adapter.otheradapter;

import com.dong.design.adapter.classadapter.Target;

public class SubClassTarget implements Target {

	@Override
	public void request() {
		System.out.println("目标实现逻辑");
	}

}
