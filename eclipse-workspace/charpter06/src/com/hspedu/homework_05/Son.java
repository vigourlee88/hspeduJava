package com.hspedu.homework_05;

public class Son extends Father{
	String name = "BB";
	public void g1() {}
	private void show() {
		//super可以访问哪些成员(属性和方法)从父类开始找
		//super.id;
		//super.f1();
		//super.name;
		//super.g1();
	    //this可以访问哪些成员?从本类开始
		//this.name;
		//this.g1();
		//this.show()递归访问
		//this.id;//父类和父类的父类
		//this.f1();
		//this.name;无法访问到，本类中已找到
		//this.g1();无法访问到，本类中已找到
	}
}
