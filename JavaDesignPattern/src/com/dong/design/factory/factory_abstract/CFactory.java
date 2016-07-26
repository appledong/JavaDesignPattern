package com.dong.design.factory.factory_abstract;

public class CFactory implements Factory {

	@Override
	public Wuqi createWuqi() {
		return new Wuqi_C();
	}

	@Override
	public Zidan createZidan() {
		return new Zidan_C();
	}

}
