package com.dong.design.decorate;

public class OneEncrypt implements Encrypt {

	@Override
	public String encrypt(String source) {
		return source + "第一次加密";
	}

}
