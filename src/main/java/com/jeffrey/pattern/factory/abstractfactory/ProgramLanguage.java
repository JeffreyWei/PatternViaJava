package com.jeffrey.pattern.factory.abstractfactory;

/**
 *功能说明
 *
 * @author weij
 */
public abstract class ProgramLanguage {
	public String getProgramLanguage(){
		return this.getClass().toString();
	}
}
