package com.dong.design.builder;

public class KfcVipBuilder implements kfcbuilder {

	private KfcHanbao kfcHanbao;
	private KfcShutiao kfcShutiao;

	public void buildHanBao(KfcHanbao kfcHanbao) {
		this.kfcHanbao = kfcHanbao;
	};

	public void buildShutiao(KfcShutiao kfcShutiao) {
		this.kfcShutiao = kfcShutiao;
	};

	public void addYinLiao() {

	}

	public KfcVipSet create() {
		KfcVipSet kfcSet = new KfcVipSet();
		kfcSet.setKfcHanbao(kfcHanbao);
		kfcSet.setKfcShutiao(kfcShutiao);
		kfcSet.setYinliao();
		return kfcSet;
	}

}
