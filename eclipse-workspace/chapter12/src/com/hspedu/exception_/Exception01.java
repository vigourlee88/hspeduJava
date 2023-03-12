package com.hspedu.exception_;

public class Exception01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
	//	int res = num1 /num2;
		//如果进行异常处理，即使出现异常，程序可以继续执行
		try{
			int res = num1 /num2;
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("出现异常的原因="+e.getMessage());
		}
		System.out.println("程序继续运行...");
	}
}
