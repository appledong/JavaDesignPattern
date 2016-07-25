package com.dong.design.observe;


public class XdObserveImpl implements Observe {

	public XdObserveImpl(WetherData wetherData) {
		wetherData.registerObserve(this);
	}
	
	@Override
	public void update(Air air) {
		System.out.println("XdObserveImpl打印出来的air数据是：" + air);
	}

}
