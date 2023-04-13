package com.hspedu.outputstream_;

import java.io.Serializable;

//如果需要序列化某个类的对象，必须实现Serializable接口
public class Dog implements Serializable{
	private String name;
	private int age;
	//序列化对象时，默认将里面所有属性都进行序列化
	//但除了static或transient修饰的成员
	private transient String color;
	private static String nation;
	//序列化对象时，要求里面属性的类型也需要实现序列化接口
	private Master master = new Master();
	//序列化的版本号，提高序列化的兼容性
	private static final long serialVersionUID = 1L;
	
	public Dog(String name, int age,String nation,String color) {
		super();
		this.name = name;
		this.age = age;
		this.nation = nation;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ","
				+ " age=" + age + ","
				+ " color=" + color +"]"+ nation + master;
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
