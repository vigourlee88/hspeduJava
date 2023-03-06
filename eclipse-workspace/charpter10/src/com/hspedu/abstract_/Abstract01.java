package com.hspedu.abstract_;

public class Abstract01 {
	public static void main(String[] args) {
		
	}
}
abstract class Animal{
	private String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	//思考 这里eat你实现了 其实没有什么意义
	//即 父类方法不确定性的问题
	//==>考虑将该方法设计为 抽象方法
	//==>所谓的抽象方法就是没有实现的方法
	//==>所谓的没有实现是指，没有方法体
	//==>当一个类中存在抽象方法时，需要将该类声明为abstract类
//	public void eat() {
//		System.out.println("这是一个动物，但是不知道吃什么...");
//	}
	public abstract void eat();
}