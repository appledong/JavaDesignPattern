package com.dong.design.templatemethod;

public class HookOneTemplate extends Template {

	@Override
	public void operation3() {
		System.out.println("操作3被第一类钩子方法实现");
	}
	
	@Override
	public void operation4() {
		super.operation4();
		System.out.println("操作4实现了");
	}

	

}
