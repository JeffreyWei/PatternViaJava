package com.jeffrey.pattern.producer.cake;

import java.util.Random;

/**
 * @author Jeffrey
 */
public class EaterThread extends Thread{
	private final Table table;
	private final Random random;
	public EaterThread(String name,Table table,long seed)
	{
		super(name);
		this.table=table;
		this.random=new Random(seed);
	}
	public void run()
	{
		try{
			while(true)
			{
				String cake=table.take();
				Thread.sleep(random.nextInt(1000));
			}
		}catch(InterruptedException e)
		{
		}
	}
}
