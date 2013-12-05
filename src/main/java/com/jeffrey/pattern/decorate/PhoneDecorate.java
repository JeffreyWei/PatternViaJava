package com.jeffrey.pattern.decorate;

/**
 * 功能说明：
 *
 * @author weij
 */
public abstract class PhoneDecorate implements Phone {
	private Phone phone;

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void sendMessage() {
		phone.sendMessage();
	}

	@Override
	public void callPhone() {
		phone.callPhone();
	}
}
