package com.hspedu.generic_;

import java.util.ArrayList;

public class Generic01 {
	public static void main(String[] args) {
		//当我们把ArrayList<Dog>表示存放到ArrayList集合中的元素是Dog
		//如果编译器发现添加的类型，不满足需求，就会报错
		//使用泛型，在遍历时，可以直接取出Dog类型而不是Object类型
		//public class ArrayList<E> {}
		ArrayList<Dog> arrayList = new ArrayList<Dog>();
		arrayList.add(new Dog("旺财",10));
		arrayList.add(new Dog("发财",1));
		arrayList.add(new Dog("小黄",5));
		
		//arrayList.add(new Cat("招财猫",8));
		System.out.println("===使用泛型===");
		for (Dog dog : arrayList) {
			System.out.println(dog.getName() + "-" +dog.getAge());
		}
	}
}
class Dog{
	private String name;
	private int age;
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}