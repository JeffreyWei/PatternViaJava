package com.jeffrey.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明：
 *
 * @author weij
 */
public class Food {
	private List<String> foodList=new ArrayList<String>();
	public String add(String foodName){
		foodList.add(foodName);
		return foodName;
	}
	public void clear(){
		foodList.clear();
	}
	public void showFood(){
		for (String str:foodList){
			System.out.println("Your order is:");
			System.out.println(str);
			System.out.println("=================");
		}
	}
}
