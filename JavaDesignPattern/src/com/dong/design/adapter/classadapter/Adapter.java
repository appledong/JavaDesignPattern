package com.dong.design.adapter.classadapter;

public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		speRequest();
	}

}
