package com.jeffrey.pattern.producer;

import java.util.Date;
import java.util.Random;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Producer extends Thread {
	private final ChannelQueue queue;
	private final String producerName;
	private final Random random;
	public Producer(ChannelQueue queue, String producerName,long seed) {
		this.queue = queue;
		this.producerName = producerName;
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
		while (true) {
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			queue.put(producerName+" paoduced at"+new Date());
		}
	}
}
