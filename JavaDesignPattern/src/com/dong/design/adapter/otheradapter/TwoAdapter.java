package com.dong.design.adapter.otheradapter;

import com.dong.design.adapter.classadapter.Adaptee;
import com.dong.design.adapter.classadapter.Target;

/***
 * 双向适配器
 * 
 * @author dong
 *
 */
public class TwoAdapter {

	private Adaptee adaptee;
	private Target target;

	public TwoAdapter() {
		super();
		this.adaptee = new Adaptee();
		this.target = new SubClassTarget();
	}

	public void request() {
		adaptee.speRequest();
	}

	public void speRequest() {
		target.request();
	}

}
