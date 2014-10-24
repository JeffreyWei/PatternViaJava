package com.jeffrey.pattern.factory.factorymethod;

/**
 *功能说明
 *
 * @author weij
 */
public class Human implements Animal {
	@Override
	public void identity() {
		System.out.println("This is Human.");
	}
}
