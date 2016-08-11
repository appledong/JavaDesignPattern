package com.dong.design.facade;

public class AbstractFacade2 implements Facade {

	@Override
	public void qicha(String name, String teaname) {
		TeaContain teaContain = new TeaContain();
		teaContain.operTeaContain();
		TeaCup teaCup = new TeaCup();
		teaCup.operTeaCup();
		Tea tea = new Tea();
		tea.operTea(name, teaname);
		Water water = new Water();
		water.operWater();
	}

}
