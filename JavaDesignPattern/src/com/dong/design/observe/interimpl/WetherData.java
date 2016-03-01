package com.dong.design.observe.interimpl;

import java.util.ArrayList;
import java.util.List;

import com.dong.design.observe.Air;
import com.dong.design.observe.inter.Observe;
import com.dong.design.observe.inter.Subject;

/**
 * 
 * @author dong
 * 空气监测站的具体实现类，也是观察者中的subject（数据是一直在变化中的）
 * 1. 空气监测站行为属性的获取和行为方法的实现
 * 2. 实现了subject接口，完成对观察者的管理（新的观察者的注册，移除，触发）
 */
public class WetherData implements Subject {

	private List<Observe> observes;
	
	private Air air;

	public Air getAir() {
		return air;
	}

	public void setAir(Air air) {
		this.air = air;
	}

	public WetherData() {
		observes = new ArrayList<Observe>();
	}
	
	/**
	 * WetherData本身具有的方法，对空气数据进行加工并触发Observe
	 * 对外公开
	 */
	public void changAirData(){
		notifyObserves();
	}

	@Override
	public void registerObserve(Observe observe) {
		observes.add(observe);
	}

	@Override
	public void removeObserve(Observe observe) {
		observes.remove(observe);
	}

	@Override
	public void notifyObserves() {
		for (Observe observe2 : observes) {
			if (observe2 != null) {
				observe2.update(air);
			}
		}
	}

}
