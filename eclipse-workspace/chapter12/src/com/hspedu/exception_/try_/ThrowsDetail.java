package com.hspedu.exception_.try_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
	public static void main(String[] args) {
		
	}

	public static void f2() {
		//1.对于编译异常，程序中必须处理，比如try-catch,throws
		//2.对于运行异常，程序中如果没有处理，默认就是throws方式处理
		//3.
		int n1 = 10;
		int n2 =0;
		double res = n1 / n2;
	}
	public static void f1() throws FileNotFoundException {
		//1.因为f3()方法抛出的是一个编译异常
		//2.即这时，就要去f1()必须处理这个编译异常
		f3();
	}
	public static void f3() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d://aa.txt");//抛出编译异常，文件找不到
	}
	public static void f4() {
		//1.在f4()中调用方法f5()是ok
		//2.原因是f5()抛出的是一个运行异常RunTimeException
		//3.而java中，并不要求程序员显示处理，因为有默认处理机制
		f5();
	}
	public static void f5() throws ArithmeticException {
		
	}
}
class Father{
	
	public void method() throws RuntimeException{
		
	}
}
class Son extends Father{
	//3.子类重写父类的方法时，对抛出的异常的规定，子类重写的方法
	//所抛出的异常类型要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类
	@Override
	public void method() throws NullPointerException{
		
	}
}