package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Collection col = new ArrayList();
		
		col.add(new Book("三国演义","罗贯中",10.1));
		col.add(new Book("小李飞刀","古龙",5.1));
		col.add(new Book("红楼梦","曹雪芹",34.6));
		
		//1.使用增强for循环遍历集合
		//2.增强for，底层仍然是迭代器
		//3.增强for理解成就是简化的迭代器遍历
		//4.快捷键foreach + alt + /
		//col指向ArrayList，其中放了3本书
		for(Object book : col) {
			System.out.println("book=" + book);
		}
		
		//增强for 也可以直接在数组使用
//		int[] nums = {1,8,10,90};
//		for(int i : nums) {
//			System.out.println("i=" + i);	
//		}
	}
}
