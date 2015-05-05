package com.jeffrey.pattern.state.simpleimp;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new StateA());
		context.request();
		context.request();
	}
}
