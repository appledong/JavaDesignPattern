package com.dong.design.adapter;

import com.dong.design.adapter.objectadapter.Adapter;
import com.dong.design.adapter.otheradapter.AdapterListener1;
import com.dong.design.adapter.otheradapter.AdapterListener2;
import com.dong.design.adapter.otheradapter.TwoAdapter;

public class AdapterTest {

	public static void objectTest() {
		Adapter adapter = new Adapter();
		adapter.request();
	}

	public static void classTest() {
		com.dong.design.adapter.classadapter.Adapter adapter = new com.dong.design.adapter.classadapter.Adapter();
		adapter.request();
	}

	public static void twoAdapterTest() {
		TwoAdapter twoAdapter = new TwoAdapter();
		System.out.println("被适配者适配目标");
		twoAdapter.request();
		System.out.println("目标适配被适配者");
		twoAdapter.speRequest();
	}

	public static void defaultAdapterTest() {
		AdapterListener1 adapterListener1 = new AdapterListener1();
		adapterListener1.oper1();
		AdapterListener2 adapterListener2 = new AdapterListener2();
		adapterListener2.oper2();
	}

	public static void main(String[] args) {
		System.out.println("对象adapte模式测试");
		objectTest();
		System.out.println("类adapte模式测试");
		classTest();
		System.out.println("双向适配器的测试");
		twoAdapterTest();
		System.out.println("默认适配器测试");
		defaultAdapterTest();
	}
}
