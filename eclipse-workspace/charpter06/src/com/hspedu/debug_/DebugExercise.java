package com.hspedu.debug_;

//1.使用断点调试的方法，追踪下一个对象创建的过程
//2.使用断点调试，查看动态绑定机制的如何工作		
public class DebugExercise {
	public static void main(String[] args) {
		//创建对象的流程
		//1.加载Person类的属性信息和方法
		//2.初始化2.1默认初始化2.2显式初始化2.3构造器初始化
		//3.返回对象的地址
		Person jack = new Person("jack",20);
		System.out.println(jack);
		
	}

}
class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
