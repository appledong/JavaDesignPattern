package com.dong.design.responsibility;

public abstract class Approver {

	protected String name;

	protected Approver successor;

	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}

	public Approver(String name) {
		super();
		this.name = name;
	}

	public abstract void handleRequest(PurchaseRequest purchaseRequest);

}
