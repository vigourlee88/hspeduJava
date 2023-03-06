package com.hspedu.codeblock_;

public class CodeBlockDetail02 {
	public static void main(String[] args) {
		A a = new A();
		//(1)getN1被调用...(2)A 静态代码01
		//(3)A 非静态代码01(4)getN2被调用... 
		//最后构造器被调用  A() 构造器被调用
	}
}

class A{
	
	{//普通代码块
		System.out.println("A 非静态代码01");
	}
	private int n2 = getN2();//非静态属性的初始化
	
	//静态属性的初始化
	private static int n1 = getN1();
	
	static {//静态代码块
		System.out.println("A 静态代码01");
	}
	
	public static int getN1() {
		System.out.println("getN1被调用...");
		
		return 100;
	}
	
	public int getN2() {//非静态方法
		System.out.println("getN2被调用...");
		return 200;
	}
	
	//无参构造器
	public A() {
		System.out.println("A() 构造器被调用");
	}
}