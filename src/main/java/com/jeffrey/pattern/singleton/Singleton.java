package com.jeffrey.pattern.singleton;

/**
 * @Auther: Mr. W
 * @Date: 2019-08-24 17:01
 * @Description:
 */
public class Singleton {
	private static String INSTANCE = null;

	public Singleton() {
		if (null != INSTANCE) {
			throw new IllegalStateException("该实例已经存在");
		}
	}

	public static String getInstance() {
		String instance = INSTANCE;
		if (instance == null) {
			synchronized (Singleton.class) {
				instance = INSTANCE;
				if (instance == null) {
					instance = INSTANCE = "instancce";
				}
			}
		}
		return instance;
	}
}
