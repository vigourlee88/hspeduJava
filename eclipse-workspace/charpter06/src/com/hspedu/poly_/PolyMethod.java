package com.hspedu.poly_;

public class PolyMethod {
	public static void main(String[] args) {
		//方法重载体现多态
		//根据对不同的参数个数去调用sum方法，就会去调用不同的方法
		//因此对sum方法来说，就是多种状态的表现
		A a = new A();
	
		System.out.println(a.sum(10, 20));
		System.out.println(a.sum(10, 20,30));
		
		//根据对象不一样，我们调用的方法就不一样
		B b = new B();
		b.say();
		
		A obja = new A();
		obja.say();
		
	}

}
class B {//父类
	public void say() {
		System.out.println("B say() 方法被调用...");
	}
}
class A extends B {//子类
	public int sum(int n1,int n2) {
		return n1 + n2;
	}
	public int sum(int n1,int n2,int n3) {
		return n1 + n2 + n3;
	}
	public void say() {
		System.out.println("A say() 方法被调用...");
	}
}