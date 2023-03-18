package com.hspedu.string_;

public class StringExercise05 {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "hspedu";
		Person p2 = new Person();
		p2.name = "hspedu";
		
		System.out.println(p1.name.equals(p2.name));//比较内容 true
		System.out.println(p1.name == p2.name);//都指向hspedu  true
		System.out.println(p1.name == "hspedu");//"hspedu" 是个常量在池中 true
		
		String s1= new String("bcde");
		String s2= new String("bcde");
		System.out.println(s1 == s2);//new出来的指向地址值不一样 false
	}
}
class Person{
	public String name;
}