package com.hspedu.codeblock_;

public class CodeBlockDetail03 {
	public static void main(String[] args) {
		new BBB(); 
		//(1)AAA的普通代码块 (2)AAA() 构造器被调用 (3)BBB的普通代码块(4)BBB() 构造器被调用
		
	}
}
//构造器的最前面其实隐含了super()和调用普通代码块，
//静态相关的代码块和属性初始化，在类加载时，就执行完毕
//因此是优先于 构造器和普通代码块执行的
class E{
	public E() {
		//这里有隐藏的执行要求
		//(1)super();//默认有一个调用父类的无参构造器
		//(2)调用普通代码块
		System.out.println("ok");
	}
}
class AAA{
	{
		System.out.println("AAA的普通代码块");
	}
	public AAA() {
		//(1)super();//隐藏super()
		//(2)调用本类 的 普通代码块
		System.out.println("AAA() 构造器被调用...");
		
	}
}
class BBB extends AAA{
	
	{//普通代码块
		System.out.println("BBB的普通代码块...");
	}
	
	public BBB () {
		
		//(1)super();//隐藏super()
		//(2)调用本类 的 普通代码块
		System.out.println("BBB() 构造器被调用...");
		
	}
	
}