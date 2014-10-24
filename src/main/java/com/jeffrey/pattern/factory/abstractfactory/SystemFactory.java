package com.jeffrey.pattern.factory.abstractfactory;

/**
 *功能说明
 *
 * @author weij
 */
public abstract class SystemFactory {
	//public SystemFactory getSytem();
	FileSystem fileSystem;
	ProgramLanguage programLanguage;
	public void getFileSystem(){
		System.out.println(fileSystem.getFileSystemName());
	}
	public void getProgramLanguage(){
		System.out.println(programLanguage.getProgramLanguage());
	}
}
