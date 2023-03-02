package com.hspedu.homework_;

public class Homework11 {
	public static void main(String[] args) {
		//向上转型:父类的引用指向子类的对象
		PersonD p = new Student();
		//写代码时编译器只认编译类型PersonD类型
		p.run();//动态绑定，执行运行类型Student //student run
		p.eat();//从子类开始找，子类没有开始调用父类 //person eat
		//向下转型:把指向子类对象的父类引用，转成指向子类对象的子类引用
		Student s = (Student)p;
	    s.run();//动态绑定 //student run
	    s.study();//student study
	    s.eat();//继承了父类//person eat
	}

}
class PersonD{
	public void run() {
		System.out.println("person run");
	}
	public void eat() {
		System.out.println("person eat");
	}
}
class Student extends PersonD{
	public void run() {
		System.out.println("student run");
	}
	public void study() {
		System.out.println("student study..");
	}
}