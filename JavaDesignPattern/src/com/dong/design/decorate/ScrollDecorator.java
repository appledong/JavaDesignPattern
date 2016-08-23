package com.dong.design.decorate;

public class ScrollDecorator {

	private Scrollview scrollview;

	public ScrollDecorator() {
		this.scrollview = new Scrollview();
	}

	public void hideScrollView() {

	}

	public void scroll() {
		hideScrollView();
		scrollview.scroll();
	}
}
