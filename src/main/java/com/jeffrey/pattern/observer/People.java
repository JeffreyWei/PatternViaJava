package com.jeffrey.pattern.observer;

/**
 * 功能说明：
 *
 * @author weij
 */
public abstract class People {
	private String name;
	private Government government;

	protected People(String name, Government government) {
		this.name = name;
		this.government = government;
	}

	public void update(String message){
		System.out.println(name+"收到通知:"+message);
	}
}
