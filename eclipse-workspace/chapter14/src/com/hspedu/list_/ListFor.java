package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListFor {
	@SuppressWarnings("all")
	public static void main(String[] args) {
	//	List list =new ArrayList();
	//	List list = new Vector();
		List list = new LinkedList();
		list.add("jack");
		list.add("tom");
		list.add("鱼香肉丝");
		list.add("北京烤鸭");
		
		//1.遍历
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			System.out.println("obj=" + obj);
		}
		
		//2.增强for
		System.out.println("====增强for====");
		for (Object obj : list) {
			System.out.println("obj=" + obj);
		}
		
		//3.使用普通for
		System.out.println("====普通for====");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("对象="+ list.get(i));
		}
	}
}
