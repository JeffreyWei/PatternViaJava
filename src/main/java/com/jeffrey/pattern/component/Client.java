package com.jeffrey.pattern.component;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Component com1=new Composite();
		com1.add(new Leaf("A"));
		com1.add(new Leaf("B"));
		Component com2=new Composite();
		com2.add(new Leaf(("C")));
		com2.add(com1);
		com2.display();
	}
}
