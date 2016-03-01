package com.dong.design.observe.interimpl;

import java.util.Observable;
import java.util.Observer;

import com.dong.design.observe.Air;

public class JavaWdObserveImpl implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof JavaWeatherData && arg instanceof Air){
			Air air = (Air) arg;
			System.out.println("JavaWdObserveImpl显示的天气数据是：" + air.toString());
		}
	}

	

}
