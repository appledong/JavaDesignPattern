package com.dong.design.facade;

public class AbstractFacadeTest {

	public static void main(String[] args) {
		Person huangyaoshi = new Person("huangyaoshi");
		Person ouyangfeng = new Person("ouyangfeng");
		Person yideng = new Person("yideng");
		CommonFacade commonFacade = new CommonFacade();
		commonFacade.qicha(huangyaoshi.name, "铁观音");
		commonFacade.qicha(ouyangfeng.name, "雨前龙井");
		commonFacade.qicha(yideng.name, "黄山毛尖");
		//对于新的需求，通过面向抽象外观接口的方式让外观模式复合开闭原则，此时扩展了新的外观类，旧的外观类无需修改，旧的客户端如果不需要执行新需求旧的客户端也不需要修改
		CommonFacade commonFacade2 = new CommonFacade();
		commonFacade2.qicha(huangyaoshi.name, "铁观音");
		commonFacade2.qicha(ouyangfeng.name, "雨前龙井");
		commonFacade2.qicha(yideng.name, "黄山毛尖");
		
		//反射动态加载外观类（类的指定是在配置文件中），实现新的外观类和旧的外观类的替换
	}

}
