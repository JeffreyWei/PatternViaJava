package com.jeffrey.pattern.adapter;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Adapter extends Target{
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void describe() {
		//super.describe();
		this.adaptee.describe();
	}
}
