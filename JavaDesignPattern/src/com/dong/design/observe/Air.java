package com.dong.design.observe;

public class Air {

	public float wd;
	public float xd;
	public float kq;
	public Air(float wd, float xd, float kq) {
		super();
		this.wd = wd;
		this.xd = xd;
		this.kq = kq;
	}
	@Override
	public String toString() {
		return "Air [wd=" + wd + ", xd=" + xd + ", kq=" + kq + "]";
	}
	
	
}
