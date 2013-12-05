package com.jeffrey.pattern.strategy;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		TravelStrategy airplaneStrategy=new AirplaneStrategy();
		Person person=new Person();
		person.setTravelStrategy(airplaneStrategy);
		person.travel();
	}
}
