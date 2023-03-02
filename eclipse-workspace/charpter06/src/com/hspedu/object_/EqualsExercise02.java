package com.hspedu.object_;

public class EqualsExercise02 {
	public static void main(String[] args) {
		Person01 p1 = new Person01();
		p1.name ="hspedu";
		
		Person01 p2 = new Person01();
		p2.name ="hspedu";
		
		//== 用于基本类型，比较值是否相等
		//== 用于引用类型,比较两个对象是否相等
		System.out.println(p1 == p2);//false
		
		//p.name是String类型，已经重写了equals方法，比较的是值内容是否相同
		System.out.println(p1.name.equals(p2.name));//true
		
		//p1是Person类，并未重写equals方法，
		//这里的equals是使用父类的Object,默认是比较的是两个对象是否相等
		System.out.println(p1.equals(p2));//false
		
		String s1 = new String("asdf");
		
		String s2 = new String("asdf");
		//字符串判断的是内容
		System.out.println(s1.equals(s2));//true
		//s1和s2不是同一个对象
		System.out.println(s1 == s2);//false
				
	}
}
class Person01{
	public String name;
	
	public Person01() {
		
	}
}