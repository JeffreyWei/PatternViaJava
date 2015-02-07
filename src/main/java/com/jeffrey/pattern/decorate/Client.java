package com.jeffrey.pattern.decorate;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Phone phone = new Iphone();
		GPS gps = new GPS();
		gps.setPhone(phone);
		gps.sendMessage();
		gps.callPhone();
	}
}
