package com.hspedu.homework_13;

public class Teacher extends Person{
	private int work_age;

	public Teacher(String name, char gender, int age, int work_age) {
		super(name, gender, age);
		this.work_age = work_age;
	}
	//方法
	@Override
	public String play() {
		return super.play() + "象棋.";
	}
    public void teach() {
    	System.out.println(getName() + "承诺，我会认真教学.");
    }

	public int getWork_age() {
		return work_age;
	}

	public void setWork_age(int work_age) {
		this.work_age = work_age;
	}
	//编写一个输出信息的方法，这样体现封装
	public void printInfo() {
		System.out.println("老师的信息:");
		System.out.println(super.basicInfo());//继承的特点
		System.out.println("工龄: "+ work_age);
		teach();//直接调用方法
		System.out.println(play());//因为返回字符串，需要打印.这里是子类的play()
		
	}
	@Override
	public String toString() {
		return "Teacher [work_age=" + work_age + "]" +super.toString();
	}
    
}
