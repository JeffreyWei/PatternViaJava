package com.jeffrey.pattern.mediator;

/**
 * 功能说明：
 *
 * @author weij
 */
public interface Mediator {
	public void sendMessage(String message,Colleague colFrom);
}
