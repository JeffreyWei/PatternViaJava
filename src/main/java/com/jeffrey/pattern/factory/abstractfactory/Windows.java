package com.jeffrey.pattern.factory.abstractfactory;

/**
 *功能说明
 *
 * @author weij
 */
public class Windows extends SystemFactory  {


	public Windows(){
		fileSystem=new NTFS();
		programLanguage=new Cmd();
	}
}
