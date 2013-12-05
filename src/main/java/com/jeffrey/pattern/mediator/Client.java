package com.jeffrey.pattern.mediator;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		MediatorImp mediator=new MediatorImp();
		Colleague person1=new Person1(mediator);
		Colleague person2=new Person2(mediator);
		mediator.setCol1(person1);
		mediator.setCol2(person2);
		person1.send();
		System.out.println("=============");
		person2.send();
	}
}
