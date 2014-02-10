package com.jeffrey.pattern.producer.cake;

/**
 * @author Jeffrey
 */
public class Table {
	private final String[] cakes;//利用数组来作为缓冲区
	private int head;//下一次蛋糕取的位置
	private int tail;//下一次蛋糕放置位置
	private int count;//桌子上蛋糕的总数
	public Table(int count)
	{
		this.cakes=new String[count];
		this.head=0;
		this.tail=0;
		this.count=0;
	}

	public synchronized void put(String cake)throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName()+" puts "+cake);
		while(count>=cakes.length)
		{
			System.out.println(Thread.currentThread().getName()+" Begin wait....");
			wait();
			System.out.println(Thread.currentThread().getName()+" End wait....");
		}
		cakes[tail]=cake;
		tail=(tail+1)%cakes.length;
		count++;
		notifyAll();
	}

	//取蛋糕
	public synchronized String take()throws InterruptedException
	{
		while(count<=0)
		{
			System.out.println(Thread.currentThread().getName()+" Begin wait....");
			wait();
			System.out.println(Thread.currentThread().getName()+" End wait....");
		}
		String cake=cakes[head];
		head=(head+1)%cakes.length;
		count--;
		notifyAll();
		System.out.println(Thread.currentThread().getName()+" gets "+cake);
		return cake;
	}
}
