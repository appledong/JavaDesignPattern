package com.dong.design.proxy.staticproxy;

public class ChunchunProtectProxy implements ProtectInterface {

	private Chunchun chun = new Chunchun();

	private int money;

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public void film() {
		if (money > 5000) {
			chun.film();
		} else{
			System.out.println("找春春拍电影需要钱的");
		}
	}

	@Override
	public void sleep(String name) {
		if (money > 10000) {
			chun.sleep(name);
		} else{
			System.out.println("那点钱还想找春春睡，穷疯了吧");
		}
	}

}
