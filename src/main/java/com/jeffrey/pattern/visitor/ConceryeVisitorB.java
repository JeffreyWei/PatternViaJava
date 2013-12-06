package com.jeffrey.pattern.visitor;

/**
 * 功能说明：
 *
 * @author weij
 */
public class ConceryeVisitorB extends Visitor {
	@Override
	public void ConcreteVisitorA(Element element) {
		System.out.println("Element:"+element.getClass().toString()+";Visitor:"+this.getClass().toString()+","+Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void ConcreteVisitorB(Element element) {
		System.out.println("Element:"+element.getClass().toString()+";Visitor:"+this.getClass().toString()+","+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
