package com.dong.design.templatemethod;

public abstract class Template {

	public void templatemethod() {
		operation1();
		operation2();
		operation3();
		operation4();
		operation5();
		if(isPrint()){
			System.out.println("子类钩子方法允许我打印了");
		}
	}

	public void operation1() {
		System.out.println("基本方法1：父类实现");
	}

	public void operation2() {
		System.out.println("基本方法2：父类实现");
	}

	/**
	 * 特殊算法步骤实现：由后续的子类实现
	 */
	public abstract void operation3();

	/**
	 * 空方法体的钩子方法，后续子类可以重写
	 */
	public void operation4() {

	}

	public void operation5() {
		System.out.println("基本方法5：父类实现");
	}

	public boolean isPrint() {
		return false;
	}

}
