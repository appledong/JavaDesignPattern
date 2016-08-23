package com.dong.design.decorate;

public class ScrollBarComponentDecorator extends ComponentDecorator {

	public ScrollBarComponentDecorator(Component component) {
		super(component);
	}

	public void setScrollView(Scrollview scrollview) {
		System.out.println("添加了滚动条");
	}

	@Override
	public void display() {
		setScrollView(new Scrollview());
		component.display();
	}

}
