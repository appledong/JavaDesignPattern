package com.dong.design.factory.factory_abstract;

/****
 * 
 * @author dong
 *
 */
public class User {

	public static void main(String[] args) {
		AFactory aFactory = new AFactory();
		Wuqi wuqi = aFactory.createWuqi();
		Zidan zidan = aFactory.createZidan();
		wuqi.installZidan(zidan);
		wuqi.shotZidan(zidan);
		BFactory bFactory = new BFactory();
		Wuqi wuqi2 = bFactory.createWuqi();
		Zidan zidan2 = bFactory.createZidan();
		wuqi2.installZidan(zidan2);
		wuqi2.shotZidan(zidan2);
		CFactory cFactory = new CFactory();
		Wuqi wuqi3 = cFactory.createWuqi();
		Zidan zidan3 = cFactory.createZidan();
		wuqi3.installZidan(zidan3);
		wuqi3.shotZidan(zidan3);
		// 测试Zidan不匹配情况
		wuqi.installZidan(zidan3);
	}
}
