package com.hspedu.set_;

import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings("all")
public class HashSetExercise {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add(new Employee("milan",18));//ok
		hashSet.add(new Employee("smith",28));//ok
		hashSet.add(new Employee("milan",18));//false
		
		//回答加入了几个，3个=> 2个
		System.out.println("hashSet=" + hashSet);
	}
}
class Employee{
	private String name;
	private int age;
	public Employee(String name, int age) {
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
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	//如果name和age相同，
	//1.先计算，在计算hashCode时，则返回相同的结果hash值
	//2.其次再使用equals，相同时返回true，
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}