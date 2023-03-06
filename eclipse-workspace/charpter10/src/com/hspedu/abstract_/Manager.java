package com.hspedu.abstract_;

public class Manager extends Employee {
    private double bonus;
    
	public Manager(String name, int id, double salary) {
		super(name, id, salary);
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	//实现了抽象方法，这个类就不用声明为抽象类，也可以实例化对象
	@Override
	public void work() {
		System.out.println("经理 "+ getName() + " 工作中...");
		
	}
}
