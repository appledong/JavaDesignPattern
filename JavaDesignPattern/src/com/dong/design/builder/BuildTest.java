package com.dong.design.builder;

public class BuildTest {

	/**
	 * 2才是真正的builder模式
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		kfcbuilder kfcbuilder = new KfcCommonBuilder();
		KfcDirector kfcDirector = new KfcDirector();
		KfcSet kfcSet1 = kfcDirector.getAKfcSet(kfcbuilder);
		KfcSet kfcSet2 = kfcDirector.getBKfcSet(kfcbuilder);
		System.out
		.println("获取的A套餐是：" + kfcSet1 + "a套餐的汉堡是："
				+ kfcSet1.getKfcHanbao() + "a套餐的薯条是："
				+ kfcSet1.getKfcShutiao());
		System.out
				.println("获取的B套餐是：" + kfcSet2 + "b套餐的汉堡是："
						+ kfcSet2.getKfcHanbao() + "b套餐的薯条是："
						+ kfcSet2.getKfcShutiao());
		KfcVipBuilder kfcVipBuilder = new KfcVipBuilder();
		KfcVipDirector kfcVipDirector = new KfcVipDirector();
		KfcVipSet kfcVipSet = kfcVipDirector.getVipKfcSet(kfcVipBuilder);
		System.out
		.println("获取的B套餐是：" + kfcVipSet + "b套餐的汉堡是："
				+ kfcVipSet.getKfcHanbao() + "b套餐的薯条是："
				+ kfcVipSet.getKfcShutiao());
		
	}
}
