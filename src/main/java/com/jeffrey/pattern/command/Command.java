package com.jeffrey.pattern.command;

/**
 * 功能说明：
 *
 * @author weij
 */
public abstract class Command {
	private Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	public void exec() {
		receiver.action();
	}
}
