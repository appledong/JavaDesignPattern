package com.dong.design.proxy.staticproxy;

/**
 * 
 * @author dong 虚拟代理类，持有相关联的A，B两个对象
 */
public class VpProxy {

	private Aproject aproject;
	private Bproject bproject;

	/**
	 * 初始化a和b对象 a对象不耗时且启动时候使用，可以直接创建 b对象耗时且启动时不使用，可以延迟创建或者另起一个线程去创建
	 */
	public VpProxy() {
		aproject = new Aproject();
		System.out.println("aproject创建的线程：" + Thread.currentThread());
		new Thread(new Runnable() {

			@Override
			public void run() {
				bproject = new Bproject();
				System.out.println("bproject创建的线程：" + Thread.currentThread());
			}
		}).start();
	}

	public void oper1() {
		System.out.println("oper1走了虚拟代理");
		aproject.oper1();
	}

	public void oper2() {
		System.out.println("oper2走了虚拟代理");
		aproject.oper2();
	}

	public void oper3() {
		System.out.println("oper3走了虚拟代理");
		if (bproject == null) {
			bproject = new Bproject();
		}
		bproject.oper3();
	}
}
