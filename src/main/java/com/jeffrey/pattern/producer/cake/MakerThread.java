package com.jeffrey.pattern.producer.cake;

import java.util.Random;

/**
 * @author Jeffrey
 */
public class MakerThread extends Thread{
	private final Table table;
	private final Random random;
	private static int id=0;
	public MakerThread(String name,Table table,long seed)
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
				Thread.sleep(random.nextInt(1000));
				String cake=" [Cake No."+nextId()+" by "+Thread.currentThread().getName()+"]";
				table.put(cake);

			}
		}catch(InterruptedException e)
		{
		}
	}
	//为了使得所有实例共享该字段
	public static synchronized int nextId()
	{
		return id++;
	}
}
