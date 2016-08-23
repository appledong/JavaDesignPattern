package com.dong.design.bridge;

public class CollectDataFromSqlServer implements CollectData{

	@Override
	public void collectdata() {
		System.out.println("sql server获取数据");
	}

}
