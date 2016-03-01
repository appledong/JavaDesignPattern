package com.dong.design.observe.inter;

import com.dong.design.observe.Air;

/**
 * 
 * @author dong
 * observe(观察者)接口，定义了一个主题数据改变后的一个update方法
 * 所有的观察者必须的实现这个接口
 */
public interface Observe {

	void update(Air air);

}
