package com.dong.design.responsibility;

public class PresidentApprover extends Approver {

	public PresidentApprover(String name) {
		super(name);
	}

	@Override
	public void handleRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getAmount() >= 100000
				&& purchaseRequest.getAmount() < 150000) {
			System.out.println("董事长" + name + "批准了订单号："
					+ purchaseRequest.getNum() + ":"
					+ purchaseRequest.getAmount() + "元钱" + "去买"
					+ purchaseRequest.getPurpose());
		} else {
			successor.handleRequest(purchaseRequest);
		}
	}

}
