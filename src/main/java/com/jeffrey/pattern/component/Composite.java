package com.jeffrey.pattern.component;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Composite implements Component {
	private List<Component> componentList = new ArrayList<Component>();

	@Override
	public void add(Component component) {
		componentList.add(component);
	}

	@Override
	public void display() {
		for (Component component : componentList) {
			component.display();
		}
	}

	@Override
	public void remove(Component component) {
		componentList.remove(component);
	}
}
