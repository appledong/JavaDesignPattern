package com.dong.design.responsibility;

public class User {

	public static void main(String[] args) {
		/***
		 * 创建职责链
		 */
		Approver direactor = new DirectorApprover("范蠡");
		Approver congress = new CongressApprover("董卓");
		direactor.setSuccessor(congress);
		Approver president = new PresidentApprover("唐明皇");
		congress.setSuccessor(president);
		Approver vicePresident = new VicePresidentApprover("中华董事会");
		president.setSuccessor(vicePresident);

		/**
		 * 创建购买的物品
		 */
		PurchaseRequest xishi = new PurchaseRequest(5000, "10001", "西施");
		PurchaseRequest zhaojun = new PurchaseRequest(220000, "10002", "王昭君");
		PurchaseRequest diaochan = new PurchaseRequest(70000, "10003", "貂蝉");
		PurchaseRequest yuhuan = new PurchaseRequest(134000, "10001", "杨玉环");

		/**
		 * 购买的物品进入职责链审批
		 */
		direactor.handleRequest(xishi);
		direactor.handleRequest(zhaojun);
		direactor.handleRequest(diaochan);
		direactor.handleRequest(yuhuan);
	}

}
