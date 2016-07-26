package com.dong.design.factory.factory_abstract;

public class AFactory implements Factory {

	@Override
	public Wuqi createWuqi() {
		return new Wuqi_A();
	}

	@Override
	public Zidan createZidan() {
		return new Zidan_A();
	}

}
