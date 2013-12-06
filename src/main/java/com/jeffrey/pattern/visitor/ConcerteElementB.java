package com.jeffrey.pattern.visitor;

/**
 * 功能说明：
 *
 * @author weij
 */
public class ConcerteElementB extends Element {
	@Override
	public void accept(Visitor visitor) {
		visitor.ConcreteVisitorB(this);
	}

	@Override
	public void operator() {

	}
}
