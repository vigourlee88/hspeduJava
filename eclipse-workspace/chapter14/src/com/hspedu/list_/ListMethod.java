package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("张三丰");
		list.add("贾宝玉");
		//在索引index = 1的位置插入一个对象,如果无指定索引，默认插入最后
		list.add(1,"韩顺平");
		System.out.println("list=" + list);
		List list2 = new ArrayList();
		list2.add("jack");
		list2.add("tom");
		//从index位置开始将集合list2中的所有元素都加进来
		list.addAll(1,list2);
		System.out.println("list=" + list);
		System.out.println(list.indexOf("tom"));
		//返回obj在当前集合中末次出现的位置
		list.add("韩顺平");
		System.out.println("list=" + list);
		System.out.println(list.lastIndexOf("韩顺平"));
		//移除指定index位置的元素，并返回此元素
		list.remove(0);
		System.out.println("list=" + list);
		//设置指定index位置的元素为else，相当于是替换
		list.set(1, "玛丽");
		System.out.println("list=" + list);
		//返回索引位置的子集合
		List returnList = list.subList(0, 2);
		System.out.println("returnList=" + returnList);
	}
}
