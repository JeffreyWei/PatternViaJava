package com.jeffrey.pattern.factory.factorymethod;

/**
 *功能说明
 *
 * @author weij
 */
public class CatCreator implements AnimalCreator {
	@Override
	public Animal creatAnimal() {
		return new Cat();
	}
}
