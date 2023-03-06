package com.hspedu.codeblock_;

public class CodeBlockDetail04 {
	public static void main(String[] args) {
		//说明
		//(1)进行类的加载
		//1.1 先加载 父类A02  
		//静态属性的初始化和静态代码块的执行 都和类加载有关
		//1.2再加载子类的 静态属性和 静态代码块
		//(2)创建对象 
		//2.1先调用子类的构造器 默认调用隐藏的super();
		//2.2
		new B02();
	}
}
class C02{
	public int n1 = 100;
	private static int n2 = 200;
	
	private void m1() {
		
	}
	private static void m2() {
		
	}
	static {
		//静态代码块，只能调用静态成员
		//System.out.println(n1);错误
		System.out.println(n2);
		//m1(); 错误
		m2();
	}
	
	{
		//普通代码块，可以调用任意成员
		System.out.println(n1);
		System.out.println(n2);
		m1(); 
		m2();
	}
}
class A02{
	private static int n1 = getVal01();
	static {
		System.out.println("A02的一个静态代码块..");//2
	}
	{
		System.out.println("A02的第一个普通代码块..");//5
	}
	public int n3 = getVal02();//普通属性的初始化
	
	public static int getVal01() {
		System.out.println("getVal01");//1
		return 10;
	}
	public int getVal02() {
		System.out.println("getVal02");//6
		return 10;
	}
	public A02() {//构造器
		//隐藏
		//super();
		//普通代码块...
		System.out.println("A02的构造器");//7
	}
}
class B02 extends A02{
	private static int n3 = getVal03();
	
	static {
		System.out.println("B02的一个静态代码块..");//4
	}
	public int n5 = getVal04();
	{
		System.out.println("B02的第一个普通代码块..");//9
	}
	public static int getVal03() {
		System.out.println("getVal03");//3
		return 10;
	}
	public static int getVal04() {
		System.out.println("getVal04");//8
		return 10;
	}
	public B02() {
		//隐藏了
		//super();
		//普通代码块...
		System.out.println("B03的构造器");//10
		
	}
}