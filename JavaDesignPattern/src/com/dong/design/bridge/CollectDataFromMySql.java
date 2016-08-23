package com.dong.design.bridge;

public class CollectDataFromMySql implements CollectData{

	@Override
	public void collectdata() {
		System.out.println("my sql获取数据");
	}

}
