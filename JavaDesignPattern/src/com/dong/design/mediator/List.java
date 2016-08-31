package com.dong.design.mediator;

public class List extends Component {

	@Override
	public void update() {
		System.out.println("新添加一个条目");
	}
	
	public void select(){
		System.out.println("列表选中张无忌");
	}

}
