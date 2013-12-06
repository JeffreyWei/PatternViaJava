package com.jeffrey.pattern.visitor;

/**
 * 功能说明：
 *
 * @author weij
 */
public abstract class Visitor {
	public abstract void ConcreteVisitorA(Element element);

	public abstract void ConcreteVisitorB(Element element);
}
