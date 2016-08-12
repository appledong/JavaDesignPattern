package com.dong.design.adapter.objectadapter;

/**
 * 适配器类
 * 
 * @author dong
 *
 */
public class Adapter implements Target {

	private Aadaptee aadaptee;
	private Badaptee badaptee;

	public Adapter() {
		super();
		this.aadaptee = new Aadaptee();
		this.badaptee = new Badaptee();
	}

	@Override
	public void request() {
		aadaptee.aRequest();
		badaptee.bRequest();
	}

}
