package com.jeffrey.pattern.iterator;

/**
 * 功能说明：
 *
 * @author weij
 */
public interface Iterator {
	public void previous();
	public void next();
	public Object currentObject();
}
