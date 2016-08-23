package com.dong.design.decorate;

public class User {

	public static void main(String[] args) {

		/***
		 * 透明装饰模式
		 */
		Component component = new TextviewComponent();
		Component component2 = new ScrollBarComponentDecorator(component);
		Component component3 = new WidthBoardComponentDecorator(component2);
		component3.display();

		/**
		 * 非透明装饰模式
		 */
		Component component4 = new ImageComponent();
		WidthBoardComponentDecorator widthBoardComponentDecorator = new WidthBoardComponentDecorator(
				component4);
		// ScrollBarComponentDecorator scrollBarComponentDecorator = new
		// ScrollBarComponentDecorator(widthBoardComponentDecorator);
		widthBoardComponentDecorator.display();

		/***
		 * 装饰模式多次装饰 这个是对String的装饰，分三个等级对String进行加密
		 */
		OneEncrypt oneEncrypt = new OneEncrypt();
		String first = oneEncrypt.encrypt("美中联姻");
		String two = new TwoEncrypt().encrypt(first);
		String three = new ThreeEncrypt().encrypt(two);
		System.out
				.println("first:" + first + " two:" + two + " three:" + three);

		/**
		 * 具体装饰类直接持有对象（不需要抽象装饰类，不需要抽象行为类）
		 */
		ScrollDecorator scrollDecorator = new ScrollDecorator();
		scrollDecorator.scroll();

	}

}
