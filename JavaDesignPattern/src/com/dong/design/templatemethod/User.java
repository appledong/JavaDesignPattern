package com.dong.design.templatemethod;

public class User {

	public static void main(String[] args) {
		System.out.println("模板方法模式的使用：");
		Template template = new ATemplate();
		template.templatemethod();
		Template template2 = new BTemplate();
		template2.templatemethod();
		System.out.println("第一类钩子方法的使用");
		Template template3 = new HookOneTemplate();
		template3.templatemethod();
		System.out.println("第二类钩子方法的使用");
		Template template4 = new HookTwoTemplate();
		template4.templatemethod();
	}

}
