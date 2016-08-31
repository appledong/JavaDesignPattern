package com.dong.design.mediator;

public class User {

	public static void main(String[] args) {
		ConcreateMediator mediator = new ConcreateMediator();

		List list = new List();
		TextBox textBox = new TextBox();
		Button button = new Button();
		Combox combox = new Combox();

		mediator.setButton(button);
		mediator.setCombox(combox);
		mediator.setList(list);
		mediator.setTextbox(textBox);

		button.setMediator(mediator);
		combox.setMediator(mediator);
		list.setMediator(mediator);
		textBox.setMediator(mediator);

		System.out.println("点击了button");
		button.change();
		System.out.println("选中了列表");
		list.change();
		System.out.println("选中了Combox");
		combox.change();

	}

}
