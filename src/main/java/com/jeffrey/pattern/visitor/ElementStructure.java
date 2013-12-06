package com.jeffrey.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明：
 *
 * @author weij
 */
public class ElementStructure {
	private List<Element> elementList = new ArrayList<Element>();

	public void attach(Element element) {
		element.accept(this.visitor);
		elementList.add(element);
	}

	public void detach(Element element) {
		elementList.remove(element);
	}

	private Visitor visitor;
	public void accept(Visitor visitor){
		this.visitor=visitor;
	}
}
