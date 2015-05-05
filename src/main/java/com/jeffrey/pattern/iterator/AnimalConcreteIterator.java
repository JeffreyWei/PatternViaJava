package com.jeffrey.pattern.iterator;

/**
 * 功能说明：
 *
 * @author weij
 */
public class AnimalConcreteIterator implements Iterator {
    Animal animal;
    private int current = 0;

    public AnimalConcreteIterator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String previous() {
        return animal.list.get(current - 1 > 0 ? --current : 0);
    }

    @Override
    public String next() {
        return animal.list.get(current + 1 < animal.list.size() ? ++current : animal.list.size());
    }

    @Override
    public String currentObject() {
        return animal.list.get(current);
    }
}
