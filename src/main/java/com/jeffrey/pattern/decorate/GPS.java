package com.jeffrey.pattern.decorate;

/**
 * 功能说明：
 *
 * @author weij
 */
public class GPS extends PhoneDecorate {
	@Override
	public void setPhone(Phone phone) {
		super.setPhone(phone);
	}

	@Override
	public void sendMessage() {
		System.out.println("GPS send");
		super.sendMessage();
	}

	@Override
	public void callPhone() {
		System.out.println("GPS call");
		super.callPhone();
	}
}
