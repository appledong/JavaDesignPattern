package com.dong.design.facade;

public class CommonTest {

	public static void main(String[] args) {
		Person huangyaoshi = new Person("huangyaoshi");
		TeaContain teaContain = new TeaContain();
		teaContain.operTeaContain();
		Tea tea = new Tea();
		tea.operTea(huangyaoshi.name, "铁观音");
		Water water = new Water();
		water.operWater();

		Person ouyangfeng = new Person("ouyangfeng");
		TeaContain teaContain2 = new TeaContain();
		teaContain2.operTeaContain();
		Tea tea2 = new Tea();
		tea.operTea(ouyangfeng.name, "雨前龙井");
		Water water2 = new Water();
		water2.operWater();

		Person yideng = new Person("yideng");
		TeaContain teaContain3 = new TeaContain();
		teaContain3.operTeaContain();
		Tea tea3 = new Tea();
		tea3.operTea(yideng.name, "黄山毛尖");
		Water water3 = new Water();
		water3.operWater();
	}

}
