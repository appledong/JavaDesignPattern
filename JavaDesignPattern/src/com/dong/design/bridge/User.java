package com.dong.design.bridge;

public class User {

	public static void main(String[] args) {
		CollectData collectDatafromsqllite = new CollectDataFromSqllite();
		CollectData collectDatafromsqlserver = new CollectDataFromSqlServer();
		CollectData collectDatafrommysql = new CollectDataFromMySql();
		DataChange dataChange = new DataChangeToExcel();
		DataChange dataChange2 = new DataChangeToWord();
		System.out.println("数据转换成为Excel");
		dataChange.setCollectData(collectDatafrommysql);
		dataChange.dataChange();
		dataChange.setCollectData(collectDatafromsqllite);
		dataChange.dataChange();
		dataChange.setCollectData(collectDatafromsqlserver);
		dataChange.dataChange();
		System.out.println("数据转换成为Word");
		dataChange2.setCollectData(collectDatafrommysql);
		dataChange2.dataChange();
		dataChange2.setCollectData(collectDatafromsqllite);
		dataChange2.dataChange();
		dataChange2.setCollectData(collectDatafromsqlserver);
		dataChange2.dataChange();
	}

}
