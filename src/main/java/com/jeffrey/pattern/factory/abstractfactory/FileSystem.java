package com.jeffrey.pattern.factory.abstractfactory;

/**
 *功能说明
 *
 * @author weij
 */
public abstract class FileSystem {
	public String getFileSystemName(){
		return this.getClass().toString();
	}

}
