package com.hspedu.final_;

public class FinalDetail01 {
	public static void main(String[] args) {
		CC cc = new CC();
		new EE().cal();
	}
}
class AA{
	//常量必须要赋值，否则要报错
	//1.定义时 如 public final double TAX_RATE=0.08;
	//2.在构造器中 
	//3.在代码块中
	
	public final double TAX_RATE = 0.08;//常量在定义时赋值
	public final double TAX_RATE2;
	public final double TAX_RATE3;
	public AA() {
		TAX_RATE2 = 1.1;//常量在构造器中赋值
	}
	//代码块是构造器的补充机制
	{
		TAX_RATE3 = 8.8;//常量在代码块中赋值
	}	
}
class BB{
	/*
	 * 如果final修饰的属性是静态的，则初始化的位置只能是
	 * 1.定义时
	 * 2.在静态代码块，不能在构造器中赋值
	 */
	public static final double TAX_RATE = 99.9; 
	public static final double TAX_RATE2; 
//	public static final double TAX_RATE3; 
	
	//构造器是在创建对象时，才会触发被调用。
	//静态变量的初始化，是在类加载时调配值的
//	public BB(){
//		TAX_RATE3 = 8.8;
//	}
	static {
		TAX_RATE2 = 3.3;
	}
}

//final类不能继承，但是可以实例化对象
final class CC{}

//如果类不是final类，但是含有final方法，则该方法虽然不能重写，但是可以被继承
//仍然遵守继承机制
class DD{
	public final void cal() {
		System.out.println("cal()方法");
	}
}
class EE extends DD{}