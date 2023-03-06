package com.hspedu.final_;

public class FinalDetail02 {
	public static void main(String[] args) {
		System.out.println(BBB.i);//16
		
		//包装类和String是final类，不能被继承
		
	}
}
//一般一个类已经是final类了，就没有必要再将方法修饰成final方法
//final 修饰构造方法即构造器
class AAA{
	public void cry() {}
}
//final和static 搭配，不会导致类的加载，底层编译器做了优化处理
class BBB{
	public static final int i = 16;
	static {
		System.out.println("BBB 静态代码块被执行");
	}
}