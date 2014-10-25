package com.jeffrey.pattern.strategy;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Person {
	private TravelStrategy travelStrategy;

	public void setTravelStrategy(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}

	public void travel(){
		this.travelStrategy.travel();
	}
}
