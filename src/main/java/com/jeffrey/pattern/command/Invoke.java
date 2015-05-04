package com.jeffrey.pattern.command;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Invoke {
	private Command command;
	public Invoke(Command command) {
		this.command = command;
	}
	public void callMethod(){
		command.execute();
	}
}
