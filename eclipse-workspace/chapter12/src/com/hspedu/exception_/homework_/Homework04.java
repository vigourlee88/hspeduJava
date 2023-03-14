package com.hspedu.exception_.homework_;

public class Homework04 {
	public static void main(String[] args) {
		try {
			showExce();
			System.out.println("A");
		}catch(Exception e) {
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
		//try-catch处理后，不会导致程序退出，仍然继续输出
		System.out.println("D");
	}
	
	public static void showExce() throws Exception{
		throw new Exception();
	}
}
