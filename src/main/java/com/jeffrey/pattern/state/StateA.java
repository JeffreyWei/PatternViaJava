package com.jeffrey.pattern.state;

/**
 * 功能说明：
 *
 * @author weij
 */
public class StateA extends State {
	@Override
	public void handle(Context context) {
		System.out.println("从状态A转到B");
		StateB stateB=new StateB();
		getContext().setState(stateB);
	}
}
