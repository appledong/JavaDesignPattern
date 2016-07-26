package com.dong.design.factory.factory_abstract;

public class Wuqi_C implements Wuqi {

	@Override
	public void installZidan(Zidan zidan) {
		System.out.println("装载C子弹");
	}

	@Override
	public void shotZidan(Zidan zidan) {
		System.out.println("发射C子弹");
	}

}
