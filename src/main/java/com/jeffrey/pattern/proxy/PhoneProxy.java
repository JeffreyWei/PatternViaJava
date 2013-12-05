package com.jeffrey.pattern.proxy;


/**
 * 功能说明：
 *
 * @author weij
 */
public class PhoneProxy implements com.jeffrey.pattern.proxy.Phone {
	private Phone phone;
	public PhoneProxy(Phone phone){
		this.phone=phone;
	}
	@Override
	public void call() {
		System.out.println("Proxy start");
		phone.call();
		System.out.println("Proxy end");
	}
}
