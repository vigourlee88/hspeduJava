package com.hspedu.set_;

import java.util.HashSet;

@SuppressWarnings("all")
public class HashSet01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet set = new HashSet();
		//1.在执行add方法后，会返回一个boolean值
		//2.如果添加成功，返回true
		System.out.println(set.add("john"));//T
		System.out.println(set.add("lucy"));
		System.out.println(set.add("john"));//F
		System.out.println(set.add("jack"));
		System.out.println(set.add("rose"));
		set.remove("john");
		System.out.println("set=" + set);
		
		set = new HashSet();
		System.out.println("set=" + set);
		set.add("lucy");//添加成功
		set.add("lucy");//加入不了
		set.add(new Dog("tom"));//ok
		set.add(new Dog("tom"));//ok
		System.out.println("set="+ set);
		
		//经典面试题
		set.add(new String("hsp"));//ok
		set.add(new String("hsp"));//ok
		System.out.println("set="+ set);
		
	}
}
class Dog{
	public String name;

	public Dog(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
}