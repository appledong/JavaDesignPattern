package com.dong.design.bridge;

public class CollectDataFromSqllite implements CollectData{

	@Override
	public void collectdata() {
		System.out.println("sql lite获取数据");
	}

}
