package com.dong.design.bridge;

public class DataChangeToExcel extends DataChange {

	@Override
	public void dataChange() {
		collectData.collectdata();
		System.out.println("数据转换成为Excel");
	}

}
