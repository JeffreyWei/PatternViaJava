package com.jeffrey.pattern.bridge;

/**
 * 功能说明：
 *
 * @author weij
 */
public class BigPen extends Pen{
	@Override
	public void draw() {
		System.out.println(this.getClass().toString());
		System.out.println(this.color.getClass().toString());
	}
}
