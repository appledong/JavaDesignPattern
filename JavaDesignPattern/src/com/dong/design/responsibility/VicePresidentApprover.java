package com.dong.design.responsibility;

public class VicePresidentApprover extends Approver {

	public VicePresidentApprover(String name) {
		super(name);
	}

	@Override
	public void handleRequest(PurchaseRequest purchaseRequest) {
		if (purchaseRequest.getAmount() >= 150000
				&& purchaseRequest.getAmount() < 250000) {
			System.out.println("董事会" + name + "批准了订单号："
					+ purchaseRequest.getNum() + ":"
					+ purchaseRequest.getAmount() + "元钱" + "去买"
					+ purchaseRequest.getPurpose());
		} else {
			successor.handleRequest(purchaseRequest);
		}
	}

}
