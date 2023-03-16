package com.jeffrey.pattern.iterator;

/**
 * 功能说明：迭代器
 * 提供一种方法顺序访问一个聚合对象中的各个元素，
 * 而又不暴露其内部的表示。
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Animal cats = new Cat();
		cats.addAnimal("xiaoqiu");
		cats.addAnimal("xiaohuang");
		cats.addAnimal("wumi");
		Iterator iterator = cats.getIterator();
		System.out.println(iterator.currentObject());
		iterator.next();
		iterator.next();
		System.out.println(iterator.currentObject());
	}
}
