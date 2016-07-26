package com.dong.design.factory.factory;

/**
 * 通用工厂类
 * 
 * @author dong
 *
 */
public class CommonCarFactory implements CarFactory2 {

	@Override
	public <T extends Car> T creatCar(Class<T> clazz) {
		Car car = null;
		try {
			car = (Car) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return (T) car;
	}

}
