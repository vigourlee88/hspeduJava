package com.hspedu.abstract_;

public class AbstractDetail01 {
	public static void main(String[] args) {
		//抽象类，不能被实例化
		//new A();
	}

}
//抽象类不一定要包含abstract方法，
//抽象类可以没有抽象方法,还可以有实现的方法
abstract class A{
	public void hi() {
		System.out.println("hi");
	}
}
//一旦类包含了abstract方法，则这个类必须声明为abstract类
abstract class B{
	public abstract void hi();
}
//abstract 只能修饰类和方法，不能修饰属性和其他的
class C{
	public int n1 = 1;
}