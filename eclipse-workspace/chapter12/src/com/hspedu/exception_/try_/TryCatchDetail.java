package com.hspedu.exception_.try_;

public class TryCatchDetail {
	public static void main(String[] args) {
		try {
			//1.若catch中有异常发生，后面的代码不会执行，
			//直接进入catch块中
			//2.若没有异常发生，则按顺序执行try的代码块，不会进入到catch中
			//3.如果希望不管是否发生异常，都执行某段代码(如关闭连接，释放资源)则使用-finally
			//String str = "123";
			String str = "翰教育";
			int a = Integer.parseInt(str);
			System.out.println("数字:" + a);
		} catch (Exception e) {
			System.out.println("异常信息:" + e.getMessage());
		}finally {
			System.out.println("finally代码块被执行...");
		}
		System.out.println("程序继续...");
	}
}
