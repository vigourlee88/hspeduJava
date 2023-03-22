package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		//使用List的实现类ArrayList完成
		List list = new ArrayList();
		for (int i = 0; i < 12; i++) {
			list.add("hello" + i);
		}
		System.out.println("list=" + list);
		list.add(1,"韩顺平教育");
		System.out.println("list=" + list);
		System.out.println("第5个元素=" + list.get(4));
		list.remove(5);
		System.out.println("list=" + list);
		list.set(6, "三国演义");
		System.out.println("list=" + list);
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			 Object obj = iterator.next();
			System.out.println("obj=" + obj);
		}
	}
}
