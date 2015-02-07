package com.jeffrey.pattern.singleton;

/**
 * 功能说明：
 *
 * @author weij
 */
public class DatabaseConnection {
	private static final MysqlConnection con=new MysqlConnection();
	public static MysqlConnection getMysqlConnection(){
		return con;
	}
}
