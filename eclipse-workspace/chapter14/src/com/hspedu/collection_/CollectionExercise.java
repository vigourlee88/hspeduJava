package com.hspedu.collection_;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
	@SuppressWarnings("all")
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Dog("小黑",3));
		list.add(new Dog("大黄",100));
		list.add(new Dog("大壮",8));
		//用迭代器遍历
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object dog = iterator.next();
			System.out.println("dog=" + dog);
		}
		//用增强for遍历
		System.out.println("====使用增强for遍历====");
		for (Object dog : list) {
			System.out.println("dog=" + dog);
			
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
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
}