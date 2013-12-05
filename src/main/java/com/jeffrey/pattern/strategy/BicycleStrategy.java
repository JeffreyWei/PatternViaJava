package com.jeffrey.pattern.strategy;

/**
 * 功能说明：
 *
 * @author weij
 */
public class BicycleStrategy extends TravelStrategy {
	@Override
	public void travel() {
		System.out.println("travel by bicycle");
	}
}
