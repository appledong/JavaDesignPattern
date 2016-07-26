package com.dong.design.factory.factory_abstract;

public class Wuqi_A implements Wuqi {

	@Override
	public void installZidan(Zidan zidan) {
		if (!(zidan instanceof Zidan_A)) {
			System.out.println("子弹不匹配，请转入A子弹");
			return;
		}
		System.out.println("装载A子弹");
	}

	@Override
	public void shotZidan(Zidan zidan) {
		System.out.println("发射A子弹");
	}

}
