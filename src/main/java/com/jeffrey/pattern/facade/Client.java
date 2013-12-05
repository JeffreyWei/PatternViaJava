package com.jeffrey.pattern.facade;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Facade facade=new Facade();
		facade.M1();
		System.out.println("=============");
		facade.M2();
	}
}
