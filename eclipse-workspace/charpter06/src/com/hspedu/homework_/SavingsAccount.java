package com.hspedu.homework_;

/*
 * 扩展一个练习的BankAccout类
 * 新类SavingsAccout每个月都有利息产生earnMonthlyInterest方法被调用
 * 并且有每月三次免手续费的存款或取款，在方法中重设交易计数
 */
public class SavingsAccount extends BankAccount{
	//新添加属性
	private int count = 3;
	private double rate = 0.01;//利率
	
	//每个月存钱产生利息的方法
	public void earnMonthlyInterest() {//每个月初，我们统计上个月的利息，同时将count = 3
		count = 3;
		//调用 存款方法，把当前余额拿到
		super.deposit(getBalance() * rate);
		
	}
	
	public SavingsAccount(double initialBalance) {
		super(initialBalance);
	
	}
    //存款重写
	@Override
	public void deposit(double amount) {
		//判断是否还可以免手续费
		if(count > 0) {
			super.deposit(amount);
		}else {
			super.deposit(amount - 1);//1块钱转入银行
		}
		count--;	
	}
	//取款重写
	@Override
	public void withdraw(double amount) {
		//判断是否还可以免手续费
		if(count > 0) {
			super.withdraw(amount);
		}else {
			super.withdraw(amount+1);//多扣1块钱，1块钱存入银行
		}
		count--;
	}

	public int getCount() {
		return count;
	}

	
	public void setCount(int count) {
		this.count = count;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
