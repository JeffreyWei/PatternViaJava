package com.jeffrey.pattern.component;

/**
 * 功能说明：组合模式
 * 允许将对象组合成树形结构来表现“整体/部分”层次结构，
 * 组合能让客户以一致的方式处理个别对象以及对象组合。
 *
 * @author weij
 */
public class Client {
	public static void main(String[] args) {
		Component com1=new Composite("root");
		com1.add(new Leaf("A"));
		com1.add(new Leaf("B"));
		Component com2=new Composite("trunk");
		com2.add(new Leaf(("C")));
		com2.add(com1);
		com2.display();
	}
}
