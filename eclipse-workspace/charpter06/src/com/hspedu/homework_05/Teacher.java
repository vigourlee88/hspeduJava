package com.hspedu.homework_05;

public class Teacher extends Employee {
	//特有属性
	private int classDays;//一年上课次数
	private double classSal;//课时费
	
	//方法 重写printSal
	@Override
	public void printSal() {//老师不能使用super.printSal();
		System.out.print("老师 ");
		System.out.println(getName() + " 年工资是: " +
	                   (getSal()*getSalMonth() + classDays*classSal));
	}

	public Teacher(String name, double sal) {
		super(name, sal);	
	}
	
	public int getClassDays() {
		return classDays;
	}

	public void setClassDays(int classDays) {
		this.classDays = classDays;
	}

	public double getClassSal() {
		return classSal;
	}

	public void setClassSal(double classSal) {
		this.classSal = classSal;
	}
	
}
