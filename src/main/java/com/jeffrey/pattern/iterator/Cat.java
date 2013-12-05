package com.jeffrey.pattern.iterator;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Cat extends Animal {
	@Override
	public Iterator getIterator() {
		return new ConcreteIterator(this);
	}

	@Override
	public void addAnimal(String name) {
		list.add(name);
	}
}
