package com.hspedu.customergeneric_;

import java.util.ArrayList;
import java.util.List;

public class GenericExtends {
	public static void main(String[] args) {
		Object o = new String("xx");
		
		//泛型不具备继承性
		//List<Object> list = new ArrayList<String>();
		
		List<Object> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<A> list3 = new ArrayList<>();
		List<B> list4 = new ArrayList<>();
		List<C> list5 = new ArrayList<>();
		
		//如果是List<?> c,可以接收任意的泛型类型
		printCollection1(list1);//ok
		printCollection1(list2);//ok
		printCollection1(list3);//ok
		printCollection1(list4);//ok
		printCollection1(list5);//ok
		
		//List<? extends A> c
		//printCollection2(list1);//错误
		//printCollection2(list2);//错误
		printCollection2(list3);//ok
		printCollection2(list4);//ok
		printCollection2(list5);//ok
		
		//List<? super A> c,A或者A的父类
		printCollection3(list1);//ok  Object
		//printCollection3(list2);//错误
		printCollection3(list3);//ok A	
		//printCollection3(list4);//错误
		//printCollection3(list5);//错误
	}
	
	//编写几个方法
	//List<?>任意泛型类型，都可以接收
	public static void printCollection1(List<?> c) {
		for(Object object : c) {//通配符，取出时，就是Object
			System.out.println(object);
		}
	}
	
	//? extends A 表示 上限，可以接受A或A的子类
	public static void printCollection2(List<? extends A> c) {
		for(Object object : c) {//通配符，取出时，就是Object
			System.out.println(object);
		}
	}
	
	//? super A ，支持A以及A的父类，不限于直接父类
	//表示泛型的下限
	public static void printCollection3(List<? super A> c) {
		for(Object object : c) {//通配符，取出时，就是Object
			System.out.println(object);
		}
	}
}
class A{
	
}
class B extends A{
	
}
class C extends B{
	
}