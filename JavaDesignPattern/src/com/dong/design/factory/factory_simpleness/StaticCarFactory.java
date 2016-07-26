package com.dong.design.factory.factory_simpleness;

public class StaticCarFactory {

	/***
	 * 静态工厂模式：
	 * 
	 * @return
	 */
	public static AudiCarInterface creatCar(CarType carType) {
		if (carType == CarType.audi_q3) {
			return new AudiCar_Q3();
		} else if (carType == CarType.audi_q5) {
			return new AudiCar_Q5();
		} else if (carType == CarType.audi_q7) {
			return new AudiCar_Q7();
		}
		return new AudiCar_Q7();
	}

}
