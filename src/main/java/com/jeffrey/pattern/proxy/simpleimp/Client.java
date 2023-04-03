package com.jeffrey.pattern.proxy.simpleimp;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Phone phone1 = new RealPhone();
		Phone phone2 = new PhoneProxy(phone1);
		phone2.call();
	}
}
