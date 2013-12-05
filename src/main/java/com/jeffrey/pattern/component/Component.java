package com.jeffrey.pattern.component;

/**
 * 功能说明：
 *
 * @author weij
 */
public interface Component {
	public void add(Component component);

	public void display();

	public void remove(Component component);
}
