package com.hspedu.exception_.homework_;

public class Homework03 {
	public static void main(String[] args) {
		try {
			func();
			//try 中抛出异常后，下面的代码不再执行
			System.out.println("A");
		}catch(Exception e) {//捕获异常
			System.out.println("C");//3.
		}
		System.out.println("D");//4.
	}
	
	public static void func() {
		try {
			//先输出finally，抛出一个运行异常
			throw new RuntimeException();//2.
		}finally {
			System.out.println("B");//1.
		}
	}
}
