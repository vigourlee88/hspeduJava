package com.hspedu.homework_13;

public class Student extends Person{
	//特有属性
	private String stu_id;
	public Student(String name, char gender, int age,String stu_id) {
		super(name, gender, age);
		this.stu_id = stu_id;
	}
	//方法
	@Override
	public String play() {
		return super.play() + "足球.";
	}
	public void study() {
		System.out.println(getName() + "承诺，我会好好学习.");
	}
	public String getStu_id() {
		return stu_id;
	}
	public void setStu_id(String stu_id) {
		this.stu_id = stu_id;
	}
	//编写一个输出信息的方法，这样体现封装
	public void printInfo() {
		System.out.println("学生的信息:");
		System.out.println(super.basicInfo());
		System.out.println("学号: "+ stu_id);
		study();//直接调用方法
		System.out.println(play());//因为返回字符串，需要打印.这里是子类的play()
		
	}
	@Override
	public String toString() {
		return "Student [stu_id=" + stu_id + "]" + super.toString();
	}
	
}
