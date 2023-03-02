package com.hspedu.homework_;

public class Homework08 {
	public static void main(String[] args) {
//		CheckingAccount checkingAccount = new CheckingAccount(1000);
//		checkingAccount.deposit(10);//1010-1 =1009
//		checkingAccount.withdraw(9);//1009-9-1 = 999
//		System.out.println(checkingAccount.getBalance());
//		
		
		//测试SavingsAccount
		SavingsAccount savingsAccount = new SavingsAccount(1000);//初始额1000
		savingsAccount.deposit(100);
		savingsAccount.deposit(100);
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());//1300.0
		savingsAccount.deposit(100);
		System.out.println(savingsAccount.getBalance());//1399.0
		
		//月初,定时器自动调用一下earnMonthlyInterest
		savingsAccount.earnMonthlyInterest();//统计利息时，count=3;
		System.out.println(savingsAccount.getBalance());
		savingsAccount.withdraw(100);//免手续
		System.out.println(savingsAccount.getBalance());
		savingsAccount.withdraw(100);//免手续
		savingsAccount.withdraw(100);//免手续
		System.out.println(savingsAccount.getBalance());
		savingsAccount.deposit(100);//存款，这里要扣手续费
		System.out.println(savingsAccount.getBalance());
		
	}
}
