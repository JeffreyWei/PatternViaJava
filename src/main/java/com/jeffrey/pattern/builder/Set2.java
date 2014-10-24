package com.jeffrey.pattern.builder;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Set2 implements KFC {
	private Food food=new Food();
	@Override
	public void makeFood() {
		food.add("全家桶");
	}

	@Override
	public void showFood() {
		food.showFood();
	}
}
