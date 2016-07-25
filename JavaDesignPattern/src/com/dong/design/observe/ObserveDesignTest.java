package com.dong.design.observe;


/**
 * 
 * @author dong
 * 以空气监测站和空气发布板为例演示观察者模式：
 * 需求：空气监测站维护者空气数据的变化，发布者有多个，随时可以添加新的和移除旧的
 */
public class ObserveDesignTest {

	public static void main(String[] args) {
		/**
		 * 手动观察者模式测试：
		 */
		WetherData wetherData = new WetherData();
		WdObserveImpl wdObserveImpl = new WdObserveImpl(wetherData);
		XdObserveImpl xdObserveImpl = new XdObserveImpl(wetherData);
		wetherData.setAir(new Air(50, 70, 60));
		wetherData.changAirData();
		/**
		 * java内置观察者模式
		 */
		JavaWeatherData javaWeatherData = new JavaWeatherData();
		JavaWdObserveImpl javaWdObserveImpl = new JavaWdObserveImpl(javaWeatherData);
		JavaXdObserveImpl javaXdObserveImpl = new JavaXdObserveImpl(javaWeatherData);
		javaWeatherData.setAir(new Air(50, 70, 60));
		javaWeatherData.changAirData();
	}

}
