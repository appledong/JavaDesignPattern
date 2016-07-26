package com.dong.design.factory.factory;

/***
 * 工厂简单方法模式：反射实现
 * @author dong
 *
 */
public interface CarFactory2 {
	public <T extends Car> T creatCar(Class<T> clazz);
}
