package com.jeffrey.pattern.factory.simplefactory;

/**
 *功能说明
 *
 * @author weij
 */
public class LenovoFactory {
	public static YSeries getYSeries(String seriesStr) {
		//reflector
		try {
			Class c = Class.forName(seriesStr);
			return (YSeries)c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
//		//if
//		if (seriesStr == "Y410") {
//			return new Y410();
//		}
//		if (seriesStr == "Y510") {
//			return new Y510();
//		}
		return null;
	}
}
