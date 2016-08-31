package com.dong.design.mediator;

public class Combox extends Component {

	@Override
	public void update() {
		System.out.println("添加了新的item");
	}
	
	public void select(){
		System.out.println("Combox选中张无忌");
	}

}
