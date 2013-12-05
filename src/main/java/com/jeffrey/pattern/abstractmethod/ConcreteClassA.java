package com.jeffrey.pattern.abstractmethod;

/**
 * 功能说明：
 *
 * @author weij
 */
public class ConcreteClassA extends AbstractClass {
	@Override
	public void method1() {
		System.out.println(this.getClass().toString()+"/t"+Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void method2() {
		System.out.println(this.getClass().toString()+"/t"+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
