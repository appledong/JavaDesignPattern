package com.dong.design.factory.factory_simpleness;

/****
 * 买家
 * 
 * @author dong
 *
 */
public class User {

	public AudiCarInterface buyCar(CarType carType) {
		SimpleCarFactory simpleCarFactory = new SimpleCarFactory();
		return simpleCarFactory.creatCar(carType);
	}

	public AudiCarInterface staticBuyCar(CarType carType) {
		return StaticCarFactory.creatCar(carType);
	}

	public void driver(CarType carType) {
		AudiCarInterface car = buyCar(carType);
		car.driver();
	}

	public static void main(String[] args) {
		User user = new User();
		user.driver(CarType.audi_q3);
		user.driver(CarType.audi_q5);
		user.driver(CarType.audi_q7);
	}
}
