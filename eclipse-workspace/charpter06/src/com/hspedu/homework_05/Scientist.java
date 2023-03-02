package com.hspedu.homework_05;

public class Scientist extends Employee{
	//特有属性
	//年终奖 bonus
	private double bonus;
	
	//重写年工资打印
	
	@Override
	public void printSal() {
	    System.out.print("科学家 ");
	    System.out.println(getName() + " 年工资是: "+ (getSal()*getSalMonth() + bonus));
	}

	public Scientist(String name, double sal) {
		super(name, sal);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
