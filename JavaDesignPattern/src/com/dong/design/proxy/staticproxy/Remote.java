package com.dong.design.proxy.staticproxy;

public class Remote implements RemoteInterface {

	@Override
	public void on() {
		System.out.println("B机器" + "on打开");
	}

	@Override
	public void off() {
		System.out.println("B机器" + "off关闭");
	}

}
