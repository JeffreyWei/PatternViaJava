package com.jeffrey.pattern.decorate;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Iphone implements Phone {
	@Override
	public void sendMessage() {
		System.out.println(this.getClass().toString()+"\t"+Thread.currentThread().getStackTrace()[1].getMethodName());
			}

	@Override
	public void callPhone() {
		System.out.println(this.getClass().toString()+"\t"+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
