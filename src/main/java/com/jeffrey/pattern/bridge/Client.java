package com.jeffrey.pattern.bridge;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Pen pen=new BigPen();
		pen.setColor(new Blue());
		pen.draw();
	}
}
