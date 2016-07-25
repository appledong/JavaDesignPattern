package com.dong.design.builder;

public class KfcVipDirector extends KfcDirector {

	public KfcVipSet getVipKfcSet(KfcVipBuilder kfcbuilder) {
		KfcHanbao kfcHanbao = new KfcLaHanbao();
		kfcbuilder.buildHanBao(kfcHanbao);
		KfcShutiao kfcShutiao = new KfcLongShutiao();
		kfcbuilder.buildShutiao(kfcShutiao);
		kfcbuilder.addYinLiao();
		return kfcbuilder.create();
	}
}
