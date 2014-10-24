package com.jeffrey.pattern.factory.abstractfactory;

/**
 *功能说明
 *
 * @author weij
 */
public class Linux extends SystemFactory{

	public Linux(){
		fileSystem=new Ext3();
		programLanguage=new Shell();
	}
}
