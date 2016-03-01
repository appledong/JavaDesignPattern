package com.dong.design.observe.interimpl;

import com.dong.design.observe.Air;
import com.dong.design.observe.inter.Observe;

public class WdObserveImpl implements Observe {
	
	/**
	 * 缓存wetherData是方便在合适的时机remove
	 */
	private WetherData wetherData;
	
	public WdObserveImpl(WetherData wetherData) {
		this.wetherData = wetherData;
		this.wetherData.registerObserve(this);
	}

	@Override
	public void update(Air air) {
		System.out.println("WdObserveImpl打印出来的air数据是：" + air);
	}

}
