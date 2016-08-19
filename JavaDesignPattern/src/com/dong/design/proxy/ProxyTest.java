package com.dong.design.proxy;

import com.dong.design.proxy.staticproxy.ChunchunProtectProxy;
import com.dong.design.proxy.staticproxy.ChunchunReferenceProxy;
import com.dong.design.proxy.staticproxy.RemoteProxy;
import com.dong.design.proxy.staticproxy.VpProxy;

public class ProxyTest {

	public static void main(String[] args) {
		System.out.println("引用代理测试：");
		ChunchunReferenceProxy chunchunReferenceProxy = new ChunchunReferenceProxy();
		chunchunReferenceProxy.song();
		System.out.println("保护代理测试：");
		ChunchunProtectProxy chunchunProtectProxy = new ChunchunProtectProxy();
		chunchunProtectProxy.setMoney(6000);
		chunchunProtectProxy.film();
		chunchunProtectProxy.sleep("老王");
		ChunchunProtectProxy chunchunProtectProxy2 = new ChunchunProtectProxy();
		chunchunProtectProxy2.setMoney(12000);
		chunchunProtectProxy2.film();
		chunchunProtectProxy2.sleep("老宋");

		System.out.println("远程代理模式测试");
		RemoteProxy remoteProxy = new RemoteProxy();
		remoteProxy.on();
		remoteProxy.off();

		System.out.println("虚拟代理模拟测试");
		VpProxy vpProxy = new VpProxy();
		vpProxy.oper1();
		vpProxy.oper2();
		vpProxy.oper3();
	}

}
