package com.dong.design.mediator;

public class TextBox extends Component {

	@Override
	public void update() {
		System.out.println("客户信息增加成功后文本框清空。");
	}

	public void setText() {
		System.out.println("文本显示：张无忌");
	}

}
