package com.dong.design.factory.factory;

/****
 * 买家
 * 
 * @author dong
 *
 */
public class User {

	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory_Audi();
		Car car = carFactory.creatCar();
		car.driver();
		CarFactory carFactory2 = new CarFactory_Benz();
		Car car2 = carFactory2.creatCar();
		car2.driver();
		CarFactory carFactory3 = new CarFactory_Bmw();
		Car car3 = carFactory3.creatCar();
		car3.driver();
		// 针对新添加的车型
		CarFactory carFactory4 = new LaosiLaisiCarFactory();
		Car car4 = carFactory4.creatCar();
		car4.driver();

		// 针对反射
		CommonCarFactory commonCarFactory = new CommonCarFactory();
		Car car5 = commonCarFactory.creatCar(AudiCar.class);
		car5.driver();
	}
}
