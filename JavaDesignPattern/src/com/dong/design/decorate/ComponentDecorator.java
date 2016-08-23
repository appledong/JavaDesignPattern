package com.dong.design.decorate;

public abstract class ComponentDecorator extends Component {

	public Component component;

	public ComponentDecorator(Component component) {
		this.component = component;
	}

}
