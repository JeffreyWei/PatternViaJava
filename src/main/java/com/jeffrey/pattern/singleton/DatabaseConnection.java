package com.jeffrey.pattern.singleton;

/**
 * @author weij
 */
public class DatabaseConnection {
	private static final MysqlConnection con = new MysqlConnection();

	public static MysqlConnection getMysqlConnection() {
		return con;
	}
}
