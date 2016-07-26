package com.dong.design.factory.factory;

public class LaosiLaisiCarFactory implements CarFactory {

	@Override
	public Car creatCar() {

		return new NewAddLaoSiLaisi();
	}

}
