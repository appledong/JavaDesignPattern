package com.dong.design.observe.interimpl;

import com.dong.design.observe.Air;
import com.dong.design.observe.inter.Observe;

public class WdObserveImpl implements Observe {

	@Override
	public void update(Air air) {
		System.out.println("WdObserveImpl打印出来的air数据是：" + air);
	}

}
