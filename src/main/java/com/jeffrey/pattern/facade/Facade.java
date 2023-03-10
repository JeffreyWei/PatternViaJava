package com.jeffrey.pattern.facade;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Facade {
	private Method1 m1 = new Method1();
	private Method2 m2 = new Method2();

	public void M1() {
		m1.foo();
		m2.foo();
	}

	public void M2() {
		m2.foo();
		m1.foo();
	}
}
