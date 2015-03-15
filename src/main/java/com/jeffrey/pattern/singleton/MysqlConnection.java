package com.jeffrey.pattern.singleton;

/**
 * 延迟加载，线程安全
 *
 * @author weij
 */
public class MysqlConnection {

    private static Object obj;

    public static Object getObj() {
        if (obj == null) {
            synchronized (MysqlConnection.class) {
                if (obj == null) {
                    obj = new Object();
                }
            }
        }
        return obj;
    }
}

