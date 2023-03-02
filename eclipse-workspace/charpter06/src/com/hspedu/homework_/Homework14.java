package com.hspedu.homework_;

public class Homework14 {
	public static void main(String[] args) {
		C c = new C();
	}

}
class A {
	public A() {//<-(5)
		System.out.println("我是A类");//①
	}
}
class B extends A{
	public B() {
		System.out.println("我是B类的无参构造器");
	}
	public B(String name) {//name = hahah <-(4)
		//隐藏了super(); //<-(5)
		System.out.println(name + "我是B类的有参构造器");//②
	}
}
class C extends B{
	public C() {  //<-(1)
		this("hello");//<-(2)
		System.out.println("我是C类的无参构造器");//④
	}
	public C(String name) {
		super("hahah");//<-(3)
		System.out.println("我是C类的有参构造器");//③
	}
}