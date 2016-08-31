package com.dong.design.mediator;

public abstract class Component {

	private Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public abstract void update();

	public void change() {
		mediator.componentChanged(this);
	};

}
