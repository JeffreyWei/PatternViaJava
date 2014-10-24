package com.jeffrey.pattern.builder;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Waiter waiter=new Waiter();
		KFC f1=new Set1();
		KFC f2=new Set2();
		waiter.sell(f1);
		waiter.sell(f2);
	}
}
