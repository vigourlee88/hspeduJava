package com.hspedu.static_;

public class StaticExercise02 {
	public static void main(String[] args) {
		
		System.out.println("Number of total is" + Person.getTotalPerson());//0
		Person p1 = new Person();//会调用构造器
		System.out.println("Number of total is" + Person.getTotalPerson());//1
		
	}

}
class Person{
	private int id;
	private static int total = 0;
	public static int getTotalPerson() {
		//id++;错误 注销
		return total;
	}
	public Person() {//构造器
		total++;//1
		id = total;//1
	}
}
