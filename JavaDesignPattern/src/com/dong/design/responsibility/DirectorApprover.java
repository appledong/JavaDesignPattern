package com.dong.design.responsibility;

public class DirectorApprover extends Approver {

	public DirectorApprover(String name) {
		super(name);
	}

	@Override
	public void handleRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getAmount() > 0
				&& purchaseRequest.getAmount() < 50000) {
			System.out.println("主任" + name + "批准了订单号："
					+ purchaseRequest.getNum() + ":"
					+ purchaseRequest.getAmount() + "元钱" + "去买"
					+ purchaseRequest.getPurpose());
		} else {
			successor.handleRequest(purchaseRequest);
		}
	}

}
