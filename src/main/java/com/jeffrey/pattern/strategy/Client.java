package com.jeffrey.pattern.strategy;

/**
 * 功能说明：策略模式
 * 封装可互换的行为，并使用委托决定使用哪一个
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		TravelStrategy airplaneStrategy = new AirplaneStrategy();
		Person person = new Person();
		person.setTravelStrategy(airplaneStrategy);
		person.travel();
	}
}
