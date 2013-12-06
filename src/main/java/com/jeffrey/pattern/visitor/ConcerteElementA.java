package com.jeffrey.pattern.visitor;

/**
 * 功能说明：
 *
 * @author weij
 */
public class ConcerteElementA extends Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.ConcreteVisitorA(this);
	}

	@Override
	public void operator() {

	}
}
