package com.jeffrey.pattern.visitor;

/**
 * 功能说明：
 *
 * @author weij
 */
public abstract class Element {
	private Visitor visitor;

	public abstract void accept(Visitor visitor);

	public abstract void operator ();
}
