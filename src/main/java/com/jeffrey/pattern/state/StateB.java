package com.jeffrey.pattern.state;

/**
 * 功能说明：
 *
 * @author weij
 */
public class StateB extends State {
	@Override
	public void handle(Context context) {
		System.out.println("从状态B转到A");
		getContext().setState(new StateA());
	}
}