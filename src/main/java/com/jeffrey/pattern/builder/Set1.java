package com.jeffrey.pattern.builder;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Set1 implements KFC {
	private Food food=new Food();
	@Override
	public void makeFood() {
		food.add("奥尔良烤鸡腿堡");
	}

	@Override
	public void showFood() {
		food.showFood();
	}
}
