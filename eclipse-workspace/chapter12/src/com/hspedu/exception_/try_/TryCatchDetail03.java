package com.hspedu.exception_.try_;

public class TryCatchDetail03 {
	/*
	 * 可以进行try-finally配合使用，这种用法相当于没有捕获异常
	 * 因此程序会直接崩掉或退出，就是执行一段代码，不管是否发生异常，
	 * 都必须执行某个业务逻辑
	 */
	public static void main(String[] args) {
		try {
			int n1 = 10;
			int n2 = 0;
			System.out.println(n1 / n2);
		}finally {
			System.out.println("执行了finally...");
		}
		System.out.println("程序继续执行...");//无catch,崩了退出，不执行
	}
}
