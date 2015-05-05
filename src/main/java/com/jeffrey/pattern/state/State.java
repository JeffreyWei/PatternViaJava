package com.jeffrey.pattern.state;

/**
 * 功能说明：
 *
 * @author weij
 */
public abstract class State {
	protected Context context;

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}
	public abstract void handle(Context context);
}
