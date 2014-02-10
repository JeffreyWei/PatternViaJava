package com.jeffrey.pattern.producer;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		ChannelQueue queue = new Stack(5);
		new Producer(queue,"producer1",31415).start();
		new Producer(queue,"producer2",95675).start();
		new Producer(queue,"producer3",45879).start();

		new Consumer(queue,"consumer1",23556).start();
		new Consumer(queue,"consumer2",14478).start();
		new Consumer(queue,"consumer3",45567).start();
		new Consumer(queue,"consumer4",53369).start();
		new Consumer(queue,"consumer5",478124).start();
	}
}
