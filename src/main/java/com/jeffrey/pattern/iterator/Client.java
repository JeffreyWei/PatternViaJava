package com.jeffrey.pattern.iterator;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Animal cats=new Cat();
		cats.addAnimal("xiaoqiu");
		cats.addAnimal("xiaohuang");
		cats.addAnimal("wumi");
		Iterator iterator=cats.getIterator();
		System.out.println(iterator.currentObject());
		iterator.next();
		iterator.next();
		System.out.println(iterator.currentObject());
	}
}
