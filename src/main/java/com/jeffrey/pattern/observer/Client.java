package com.jeffrey.pattern.observer;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Government government = new ChineseGovernment();
		People people1 = new ChinesePeople("A", government);
		People people2 = new ChinesePeople("B", government);
		People people3 = new ChinesePeople("C", government);
		government.addPeople(people1);
		government.addPeople(people2);
		government.addPeople(people3);
		government.notifyPeople();
	}
}
