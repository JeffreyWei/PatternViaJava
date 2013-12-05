package com.jeffrey.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明：
 *
 * @author weij
 */
public abstract class Animal {
	public List<String> list=new ArrayList<String>();
	private Iterator iterator;
	public abstract Iterator getIterator();
	public abstract void addAnimal(String name);
}
