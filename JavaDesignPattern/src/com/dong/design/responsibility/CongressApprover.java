package com.dong.design.responsibility;

public class CongressApprover extends Approver {

	public CongressApprover(String name) {
		super(name);
	}

	@Override
	public void handleRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getAmount() >= 50000
				&& purchaseRequest.getAmount() < 100000) {
			System.out.println("总经理" + name + "批准了订单号："
					+ purchaseRequest.getNum() + ":"
					+ purchaseRequest.getAmount() + "元钱" + "去买"
					+ purchaseRequest.getPurpose());
		} else {
			successor.handleRequest(purchaseRequest);
		}
	}

}
