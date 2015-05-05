package com.jeffrey.pattern.facade;

/**
 * 功能说明：外观模式
 * 简化一个或多个类的接口
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
