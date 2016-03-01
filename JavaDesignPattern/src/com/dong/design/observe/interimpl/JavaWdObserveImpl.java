package com.dong.design.observe.interimpl;

import java.util.Observable;
import java.util.Observer;

import com.dong.design.observe.Air;

/**
 * 
 * @author dong
 * observe的具体实现，将自己注册到需要依赖的subject中去
 */
public class JavaWdObserveImpl implements Observer {

	public JavaWdObserveImpl(JavaWeatherData javaWeatherData) {
		javaWeatherData.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof JavaWeatherData && arg instanceof Air) {
			Air air = (Air) arg;
			System.out.println("JavaWdObserveImpl显示的天气数据是：" + air.toString());
		}
	}

}
