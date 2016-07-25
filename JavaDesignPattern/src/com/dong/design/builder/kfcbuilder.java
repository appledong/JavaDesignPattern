package com.dong.design.builder;

public interface kfcbuilder {
	public void buildHanBao(KfcHanbao kfcHanbao);

	public void buildShutiao(KfcShutiao kfcShutiao);

	public KfcSet create();
}
