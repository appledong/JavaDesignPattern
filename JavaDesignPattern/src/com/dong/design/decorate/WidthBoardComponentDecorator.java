package com.dong.design.decorate;

public class WidthBoardComponentDecorator extends ComponentDecorator {

	public WidthBoardComponentDecorator(Component component) {
		super(component);
	}

	public void setWidth(int width) {
		System.out.println("设置了边框");
	}

	@Override
	public void display() {
		setWidth(1000);;
		component.display();
	}

}
