package com.dong.design.mediator;

public class ConcreateMediator extends Mediator {

	private TextBox textbox;
	private List list;
	private Combox combox;
	private Button button;

	public void setTextbox(TextBox textbox) {
		this.textbox = textbox;
	}

	public void setList(List list) {
		this.list = list;
	}

	public void setCombox(Combox combox) {
		this.combox = combox;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	@Override
	public void componentChanged(Component component) {
		if (component instanceof TextBox) {

		} else if (component instanceof List) {
			combox.select();
			textbox.setText();
		} else if (component instanceof Button) {
			list.update();
			combox.update();
			textbox.update();
		} else if (component instanceof Combox) {
			list.select();
			textbox.setText();
		}
	}

}
