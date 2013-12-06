package com.jeffrey.pattern.state;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		state.setContext(this);
		System.out.println("当前状态:"+state.getClass().toString());
	}

	public void request(){
		this.state.handle(this);
	}
}
