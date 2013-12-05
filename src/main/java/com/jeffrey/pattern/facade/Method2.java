package com.jeffrey.pattern.facade;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Method2 {
	public void foo(){
		System.out.println(getClass().toString()+"\t"+Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
