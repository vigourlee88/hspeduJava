package com.hspedu.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("all")
public class Collections_ {
	public static void main(String[] args) {
		//创建ArrayList集合，用于测试
		List list  = new ArrayList();

		list.add("tom");
		list.add("smith");
		list.add("king");
		list.add("milan");
		list.add("tom");
		
	    //reverse (List);反转List中元素的顺序
		Collections.reverse(list);
		System.out.println("list=" + list);
		//shuffle(List); 对List集合元素进行 随机顺序
//		for (int i = 0; i < 5; i++) {
//			Collections.shuffle(list);
//			System.out.println("list=" + list);
//		}
		Collections.sort(list);
		System.out.println("自然排序后");
		System.out.println("list=" + list);
		//sort(List);根据元素的自然顺序
		//对指定List集合元素按升序排序
		
		//sort(List,Comparator);
		//根据指定的Comparator产生的顺序对List集合
		//我们希望按照 字符串的长度大小顺序
		Collections.sort(list,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				//可以加入校验代码
				//if(o1 instanceof String)
				return ((String) o1).length()- ((String) o2).length();
			}	
		});
		System.out.println("按照字符串长度大小排序" + list);
		//swap(List,int i,int j);
		//将指定list集合的i处元素和j处元素进行交换
		Collections.swap(list,0,1);
		System.out.println("交换后的情况"+ list);
		
		//Object max(Collection)根据元素的自然顺序，返回给定集合中的最大元素
		System.out.println("自然顺序最大元素=" + Collections.max(list));
		//Object max(Collection,Comparator)
		//根据Comparator指定的顺序，返回给定集合中的最大元素
		//比如，我们要返回长度最大的元素
		Object maxObject = Collections.max(list,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((String)o1).length()-((String)o2).length();
			}	
		});
		System.out.println("长度最大的元素"+ maxObject);
		
		//int frequency(Collection,Object):返回指定集合中指定元素的出现次数
		System.out.println("tom出现的次数="+ Collections.frequency(list, "tom"));
		//void copy(List dest,List src):将src中的内容复制到dest中
		ArrayList dest = new ArrayList();
		
		//为了完成一个完整的拷贝，需要先给dest 赋值 大小和list.size()一样
		for (int i = 0; i < list.size(); i++) {
			dest.add(" ");
		}
		//拷贝 dest 目的地，原文件list
		Collections.copy(dest, list);
		
		System.out.println("dest=" + dest);
		
		//boolean replaceAll(List list,Object oldVal,Object newVal):
		//使用新值替换List 对象的所有旧值
		//如果list中,如果有tom替换成汤姆
		Collections.replaceAll(list,"tom", "汤姆");
		System.out.println("list替换后=" + list);
	}
}
