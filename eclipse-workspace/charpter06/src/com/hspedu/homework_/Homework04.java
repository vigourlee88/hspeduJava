package com.hspedu.homework_;

//通过继承实现员工工资核算打印功能
public class Homework04 {
	public static void main(String[] args) {
		Manager manager = new Manager("刘备",100,20,1.2);
		//设置奖金 一般工作一年后才有奖金
		manager.setBonus(3000);
		//打印经理的工资情况
		manager.printSal();
		
		Worker worker = new Worker("关羽",50,10,1.0);
		worker.printSal();
	}
}

