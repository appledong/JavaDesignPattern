package com.dong.design.facade;

public class CommonFacadeTest {

	public static void main(String[] args) {
		Person huangyaoshi = new Person("huangyaoshi");
		Person ouyangfeng = new Person("ouyangfeng");
		Person yideng = new Person("yideng");
		CommonFacade commonFacade = new CommonFacade();
		commonFacade.qicha(huangyaoshi.name, "铁观音");
		commonFacade.qicha(ouyangfeng.name, "雨前龙井");
		commonFacade.qicha(yideng.name, "黄山毛尖");
	}

}
