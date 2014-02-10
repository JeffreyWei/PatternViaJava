package com.jeffrey.pattern.producer;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Stack implements ChannelQueue {
	private  String[] queue;
	private int head;
	private int tail;
	private int count;

	public Stack(int size) {
		queue=new String[size];
		this.head = 0;
		this.tail = 0;
		this.count = 0;
	}

	@Override
	public synchronized void put(String key) {
		while (count>=queue.length) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		queue[tail]=key;
		tail=(tail+1)%queue.length;
		count++;
		notifyAll();
	}

	@Override
	public synchronized String get(String key) {
		while (count <= 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String value=queue[head];
		head = (head + 1) % queue.length;
		count--;
		notifyAll();
		return value;
	}
}
