package com.jeffrey.pattern.mediator;

/**
 * 功能说明：
 *
 * @author weij
 */
public abstract class Colleague {
	private Mediator mediator;

	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}

	public void send(){
		mediator.sendMessage("Message from "+this.getClass().toString(),this);
	}

	public void receive(String message){
		System.out.println(this.getClass().toString()+" get message:");
		System.out.println(message);
	}
}
