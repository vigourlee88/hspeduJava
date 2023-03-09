package com.hspedu.Annotation_;

//@Override:限定某个方法，是重写父类方法，该注解只能用于方法
public class Override_ {
	public static void main(String[] args) {
		new Son();
	}
}
class Father {
	public void fly() {
		System.out.println("Father fly...");
	}
}
class Son extends Father{

	//1.@Override 注解放在fly方法上，表示子类的fly方法时重写了父类
	//2.这里如果没有写 @Override 还是重写了父类fly
	//3.如果你写了@Override,编译器就会去检查该方法是否真的重写了方法
	// 如果的确重写了，则编译通过，如果没有构成重写，则编译错误
	//4.@Override的定义
	//如果@interface 表示是一个注解类
	@Override
	public void fly() {
		System.out.println("Son fly...");
	}	
}