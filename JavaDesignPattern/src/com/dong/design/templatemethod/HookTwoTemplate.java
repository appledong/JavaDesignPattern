package com.dong.design.templatemethod;

public class HookTwoTemplate extends Template {

	@Override
	public void operation3() {
		System.out.println("操作3被第二类钩子方法实现");
	}

	@Override
	public boolean isPrint() {
		return true;
	}
}
