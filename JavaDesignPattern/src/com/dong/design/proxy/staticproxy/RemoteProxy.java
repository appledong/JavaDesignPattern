package com.dong.design.proxy.staticproxy;

public class RemoteProxy implements RemoteInterface {

	private Remote remote;

	public RemoteProxy() {
		remote = conectAndGetRemote();
	}

	private Remote conectAndGetRemote() {
		System.out.println("连接上B机器获得了Remote对象");
		return new Remote();
	}

	@Override
	public void on() {
		System.out.println("a机器调用了B机器的打开命令");
		remote.on();
	}

	@Override
	public void off() {
		System.out.println("a机器调用了B机器的关闭命令");
		remote.off();
	}

}
