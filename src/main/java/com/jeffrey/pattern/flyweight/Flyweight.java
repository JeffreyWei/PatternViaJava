package com.jeffrey.pattern.flyweight;

import java.util.Hashtable;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Flyweight {
	private static Hashtable<String, Object> hs = new Hashtable<String, Object>();

	static {
		hs.put("A", 1);
		hs.put("B", 1);
		hs.put("C", 1);
	}

	public static Object getObj(String key) {
		return hs.get(key);
	}
}
