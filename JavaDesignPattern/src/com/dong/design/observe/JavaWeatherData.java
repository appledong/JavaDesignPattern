package com.dong.design.observe;

import java.util.Observable;

/**
 * 
 * @author dong
 * Java对于观察者模式进行支持，在主题这儿提供了一个Observable类
 * Observable类的实现和手动基本一致对Observe进行管理（注册，移除，触发）
 * 里面多了一个状态值state：将触发的权利对外了，不会在里面自动触发。
 */
public class JavaWeatherData extends Observable{
	private Air air;

	public Air getAir() {
		return air;
	}

	public void setAir(Air air) {
		this.air = air;
	}
	
	/**
	 * WetherData本身具有的方法，对空气数据进行加工并触发Observe
	 * 对外公开
	 */
	public void changAirData(){
		setChanged();
		notifyObservers(air);
	}
}
