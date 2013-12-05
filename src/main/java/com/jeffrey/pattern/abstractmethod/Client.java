package com.jeffrey.pattern.abstractmethod;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
AbstractClass abstractClass=new ConcreteClassA();
		abstractClass.templateMethod();
	}
}
