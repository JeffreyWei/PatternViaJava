package com.jeffrey.pattern.producer;

import java.util.Random;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Consumer  extends Thread {
	private final ChannelQueue queue;
	private final String consumerName;
private final Random random;
	public Consumer(ChannelQueue queue, String consumerName,long seed) {
		this.queue = queue;
		this.consumerName = consumerName;
		random = new Random(seed);
	}

	/**
	 * When an object implementing interface <code>Runnable</code> is used
	 * to create a thread, starting the thread causes the object's
	 * <code>run</code> method to be called in that separately executing
	 * thread.
	 * <p/>
	 * The general contract of the method <code>run</code> is that it may
	 * take any action whatsoever.
	 *
	 * @see Thread#run()
	 */
	@Override
	public void run() {
		while (true){
			String value=queue.get(null);
			System.out.println(consumerName+" get value:"+value);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
