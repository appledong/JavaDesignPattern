package com.dong.design.factory.factory_abstract;

public class BFactory implements Factory {

	@Override
	public Wuqi createWuqi() {
		return new Wuqi_B();
	}

	@Override
	public Zidan createZidan() {
		return new Zidan_B();
	}

}
