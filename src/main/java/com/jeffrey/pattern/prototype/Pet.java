package com.jeffrey.pattern.prototype;

import java.io.Serializable;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Pet implements Serializable{
	private static final long serialVersionUID = -5790998556508104079L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Pet(String name){
		this.name=name;
	}
}
