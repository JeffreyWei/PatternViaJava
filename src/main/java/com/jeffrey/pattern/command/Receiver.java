package com.jeffrey.pattern.command;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Receiver {
	private String name;

	public Receiver(String name) {
		this.name = name;
	}

	public void action() {
		System.out.println("Action name is " + this.name);
	}
}
