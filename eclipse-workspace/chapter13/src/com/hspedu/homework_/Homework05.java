package com.hspedu.homework_;

public class Homework05 {
	public static void main(String[] args) {
		
		String s1 = "hspedu";
		Animal a = new Animal(s1);
		Animal b = new Animal(s1);
		System.out.println(a == b);//false
		//a.equals 调的是Animal的equals,没有重写。本质是判断a==b
		System.out.println(a.equals(b));//false
		System.out.println(a.name == b.name);//true

		//String 堆中有一个Value
		String s4 = new String("hspedu");
		String s5 = "hspedu";
		
		System.out.println(s1 == s4);//s4指向堆中，s1指向池中 false
		System.out.println(s4 == s5);//false
		
		String t1 = "hello" + s1;
		String t2 = "hellohspedu";
		//t1.intern()返回字符串，在池中地址
		System.out.println(t1.intern() == t2);//true
	
	}
}
class Animal{
	String name;
	public Animal(String name) {
		this.name = name;
	}
}
