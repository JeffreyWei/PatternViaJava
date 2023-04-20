package com.jeffrey.pattern.state.simpleimp;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Context {
	private State state;
	private static AtomicInteger count = new AtomicInteger(0);

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		state.setContext(this);
		System.out.println("当前状态:" + state.getClass().toString());
	}

	public void request() {
		count.incrementAndGet();
		this.state.handle(this);
	}
}
