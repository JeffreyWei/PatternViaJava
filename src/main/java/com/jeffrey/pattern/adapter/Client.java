package com.jeffrey.pattern.adapter;

/**
 *
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Target target = new Adapter(new Adaptee());
		target.describe();
	}
}
