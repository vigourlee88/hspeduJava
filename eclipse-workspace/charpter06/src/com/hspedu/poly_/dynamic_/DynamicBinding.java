package com.hspedu.poly_.dynamic_;

public class DynamicBinding {
	public static void main(String[] args) {
		
		//java的动态绑定机制 非常重要
		//父类的引用指向子类的对象 向上转型
		//a 编译类型是A,运行类型是B
		A a = new B();
		System.out.println(a.sum());
		//看运行类型 40 若注销B的sum(), A sum()->B getI()找 则输出30
		//当调用对象方法的时候，该方法与运行机制绑定
		System.out.println(a.sum1());
		//30 若注销B sum1() -> A sum1() 找 则输出 20
		//当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
	}
	
}
