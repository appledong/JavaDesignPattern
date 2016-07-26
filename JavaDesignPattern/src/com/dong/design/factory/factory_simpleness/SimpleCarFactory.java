package com.dong.design.factory.factory_simpleness;

public class SimpleCarFactory {

	/***
	 * 简单工厂模式：
	 * 工厂生产不同的产品，返回不同的产品
	 * 简单模式不易添加新的品类，没添加一种都得再修改factory类
	 * @return
	 */
	public AudiCarInterface creatCar(CarType carType) {
		if (carType == CarType.audi_q3) {
			return new AudiCar_Q3();
		} else if (carType == CarType.audi_q5) {
			return new AudiCar_Q5();
		} else if (carType == CarType.audi_q7) {
			return new AudiCar_Q7();
		} else if (carType == CarType.audi_q9) {
			return new NewAddAudi_Q9();
		}
		return new AudiCar_Q7();
	}

}
