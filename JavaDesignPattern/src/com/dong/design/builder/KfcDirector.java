package com.dong.design.builder;

public class KfcDirector {

	public KfcSet getAKfcSet(kfcbuilder kfcbuilder) {
		KfcHanbao kfcHanbao = new KfcLaHanbao();
		kfcbuilder.buildHanBao(kfcHanbao);
		KfcShutiao kfcShutiao = new KfcLongShutiao();
		kfcbuilder.buildShutiao(kfcShutiao);
		return kfcbuilder.create();
	}

	public KfcSet getBKfcSet(kfcbuilder kfcbuilder) {
		KfcHanbao kfcHanbao = new KfcSuanHanbao();
		kfcbuilder.buildHanBao(kfcHanbao);
		KfcShutiao kfcShutiao = new KfcShortShutiao();
		kfcbuilder.buildShutiao(kfcShutiao);
		return kfcbuilder.create();
	}

}
