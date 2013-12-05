package com.jeffrey.pattern.command;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Receiver receiver = new Receiver("Just do it");
		Command command = new CommandImp(receiver);
		Invoke invoke = new Invoke(command);
		invoke.callMethod();
	}
}
