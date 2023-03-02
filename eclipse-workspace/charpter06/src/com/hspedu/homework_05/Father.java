package com.hspedu.homework_05;

public class Father extends Grand{
	String id = "001";
	private double score;
	public void f1() {
		//super可以访问哪些成员(属性和方法)
		//super.name;
		super.g1();
		//super.age;
		//this可以访问哪些成员 从本类开始查找
		//this.id;
		//this.score;
		//this.f1();
		//this.name;
		//this.g1();
	}
}
