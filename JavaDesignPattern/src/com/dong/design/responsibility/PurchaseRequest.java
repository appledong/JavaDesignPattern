package com.dong.design.responsibility;

public class PurchaseRequest {

	public PurchaseRequest(int amount, String num, String purpose) {
		super();
		this.amount = amount;
		this.num = num;
		this.purpose = purpose;
	}

	private int amount;
	private String num;
	private String purpose;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

}
