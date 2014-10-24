package com.jeffrey.pattern.factory.factorymethod;

/**
 *功能说明
 *
 * @author weij
 */
public class HumanCreator implements AnimalCreator {
	@Override
	public Animal creatAnimal() {
		return new Human();
	}
}
