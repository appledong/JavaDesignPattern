package com.dong.design.bridge;

public abstract class DataChange {

	public CollectData collectData;

	public void setCollectData(CollectData collectData) {
		this.collectData = collectData;
	}
	
	public abstract void dataChange();

}
