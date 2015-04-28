package com.jeffrey.pattern.singleton;

/**
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		MysqlConnection my1=DatabaseConnection.getMysqlConnection();
		MysqlConnection my2=DatabaseConnection.getMysqlConnection();
		System.out.println(my1==my2);
	}
}
