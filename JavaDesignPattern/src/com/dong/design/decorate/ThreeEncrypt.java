package com.dong.design.decorate;

public class ThreeEncrypt implements Encrypt {

	@Override
	public String encrypt(String source) {
		return source + "第三次加密";
	}

}
