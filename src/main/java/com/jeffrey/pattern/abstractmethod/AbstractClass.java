package com.jeffrey.pattern.abstractmethod;

/**
 * 功能说明：
 *
 * @author weij
 */
public abstract class AbstractClass {
	public abstract void method1();
	public abstract void method2();
	public void templateMethod(){
		method1();
		method2();
	}
}
