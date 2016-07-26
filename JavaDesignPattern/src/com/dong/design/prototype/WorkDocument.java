package com.dong.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class WorkDocument implements Cloneable {

	@Override
	public String toString() {
		return "WorkDocument [document=" + document + ", images=" + images
				+ "]";
	}

	private String document;
	private ArrayList<String> images = new ArrayList<>();

	public void setDocument(String document) {
		this.document = document;
	}

	public void addImage(String name) {
		images.add(name);
	}

	@Override
	protected WorkDocument clone() throws CloneNotSupportedException {
		WorkDocument workDocument = (WorkDocument) super.clone();
		workDocument.document = this.document;
		workDocument.images = (ArrayList<String>) this.images.clone();
		return workDocument;
	}

}
