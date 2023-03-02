package com.hspedu.homework_05;

public class Worker extends Employee{
	//属性
	//工人，农民，服务生只有基本工资sal
	public Worker(String name, double sal) {
		super(name, sal);
		
	}
	//方法

	@Override
	public void printSal() {
		System.out.print("工人 ");
		super.printSal();//使用父类的方法
	}
}
