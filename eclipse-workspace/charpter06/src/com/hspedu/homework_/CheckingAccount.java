package com.hspedu.homework_;

//在上面的类的基础上扩展新类CheckingAccout
//对每次存款和取款都收取1美元的手续费
public class CheckingAccount extends BankAccount{//新的账号

	public CheckingAccount(double initialBalance) {
		super(initialBalance);
		
	}

	//存款
	@Override
	public void deposit(double amount) {
		
		super.deposit(amount - 1);
		//1 块钱转入银行的账号
	}

	//取款
	@Override
	public void withdraw(double amount) {
	
		super.withdraw(amount + 1);
		//1 块钱转入银行的账号
	}

}
