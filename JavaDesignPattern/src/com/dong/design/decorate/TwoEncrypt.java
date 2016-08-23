package com.dong.design.decorate;

public class TwoEncrypt implements Encrypt {

	@Override
	public String encrypt(String source) {
		return source + "第二次加密";
	}

}
