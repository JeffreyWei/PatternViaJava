package com.jeffrey.pattern.command;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Human human=new Human();
		HumanWorkCommand humanWorkCommand = new HumanWorkCommand(human);
		Invoke invoke=new Invoke(humanWorkCommand);
		invoke.callMethod();
	}
}
