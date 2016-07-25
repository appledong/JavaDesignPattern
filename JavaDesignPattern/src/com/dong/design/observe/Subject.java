package com.dong.design.observe;

/**
 * 
 * @author dong
 * 主题接口：定义了observe的三个方法（注册，移除，触发）观察者模式中的主题必须实现该接口
 * observe接口作为参数传入
 */
public interface Subject {
	void registerObserve(Observe observe);

	void removeObserve(Observe observe);

	void notifyObserves();
}
