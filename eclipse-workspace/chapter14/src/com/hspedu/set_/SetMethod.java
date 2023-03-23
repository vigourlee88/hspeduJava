package com.hspedu.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings("all")
public class SetMethod {
	public static void main(String[] args) {
		//1.以Set接口的实现类HashSet,来讲解Set接口的方法
		//2.Set接口的实现类的对象(Set接口对象)，不能存放重复元素，可以添加一个null
		//3.Set接口对象存放数据是无序的(即添加的顺序和取出的顺序不一致)
		//4.注意 取出的数据虽然不是添加的顺序，但是固定的
		//接口对象 不能通过索引来获取，普通for循环不可以使用
		Set set = new HashSet();
		set.add("john");
		set.add("lucy");
		set.add("john");
		set.add("jack");
		set.add(null);
		set.add(null);
		for(int i = 0;i < 10;i++) {
		  System.out.println("set=" + set);
		}
		
		set.remove(null);
		
		System.out.println("==使用迭代器==");
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object obj = (Object) iterator.next();
			System.out.println("obj="+ obj);
		}
		
		System.out.println("==使用增强for==");
		for (Object obj : set) {
			System.out.println("obj="+ obj);
		}
	}
}
