package com.jeffrey.pattern.observer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * 功能说明：
 *
 * @author weij
 */
public abstract class Government {
	private List<People> PeopleList=new ArrayList<People>();
	public void addPeople(People people){
		PeopleList.add(people);
	}
	public void detach(People people){
		PeopleList.remove(people);
	}
	public void notifyPeople(){
		for(People people :PeopleList){
			SimpleDateFormat sdf = new SimpleDateFormat("", Locale.SIMPLIFIED_CHINESE);
			sdf.applyPattern("yyyy年MM月dd日 HH时mm分ss秒");
			people.update(sdf.format(new Date()));
		}
	}
}
