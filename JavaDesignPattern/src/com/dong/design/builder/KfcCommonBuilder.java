package com.dong.design.builder;

public class KfcCommonBuilder implements kfcbuilder {

	private KfcHanbao kfcHanbao;
	private KfcShutiao kfcShutiao;

	public void buildHanBao(KfcHanbao kfcHanbao) {
		this.kfcHanbao = kfcHanbao;
	};

	public void buildShutiao(KfcShutiao kfcShutiao) {
		this.kfcShutiao = kfcShutiao;
	};

	public KfcSet create() {
		KfcSet kfcSet = new KfcSet();
		kfcSet.setKfcHanbao(kfcHanbao);
		kfcSet.setKfcShutiao(kfcShutiao);
		return kfcSet;
	}

}
