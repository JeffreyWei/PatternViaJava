package com.jeffrey.pattern.visitor;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		ElementStructure elementStructure = new ElementStructure();
		elementStructure.accept(new ConcerteVisitorA());
		elementStructure.attach(new ConcerteElementA());
		elementStructure.attach(new ConcerteElementB());
	}
}
