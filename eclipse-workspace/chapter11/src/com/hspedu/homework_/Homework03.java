package com.hspedu.homework_;

public class Homework03 {
	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.shout();
		Animal dog = new Dog();
		dog.shout();
	}
}
//声明为抽象方法的类一定是抽象类
abstract class Animal{
	public abstract void shout();
}
class Cat extends Animal{

	@Override
	public void shout() {
		System.out.println("猫会喵喵叫");
	}	
}
class Dog extends Animal{

	@Override
	public void shout() {
		System.out.println("狗会汪汪叫");
	}
	
}