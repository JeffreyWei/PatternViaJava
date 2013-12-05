package com.jeffrey.pattern.iterator;

/**
 * 功能说明：
 *
 * @author weij
 */
public class ConcreteIterator implements Iterator {
	Animal animal;
	private int current = 0;

	public ConcreteIterator(Animal animal) {
		this.animal = animal;
	}

	@Override
	public void previous() {
		animal.list.get(current - 1 > 0 ? --current : 0);
	}

	@Override
	public void next() {
		animal.list.get(current + 1 < animal.list.size() ? ++current : animal.list.size());
	}

	@Override
	public Object currentObject() {
		return animal.list.get(current);
	}
}
