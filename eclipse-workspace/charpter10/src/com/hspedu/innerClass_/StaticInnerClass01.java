package com.hspedu.innerClass_;

import com.hspedu.innerClass_.Outer10.Inner10;

public class StaticInnerClass01 {
	public static void main(String[] args) {
		Outer10 outer10 = new Outer10();
		outer10.m1();
		
		//外部其他类 使用 静态内部类
		//方式1
		//因为静态内部类，是可以通过类名直接访问(前提是满足访问权限)
		Outer10.Inner10 inner10 = new Outer10.Inner10();
		inner10.say();
		
		//方式2
		//填写一个方法，可以返回静态内部类的实例
	    Outer10.Inner10 inner101 = outer10.getInner10Instance();
	    System.out.println("==============");
	    inner101.say();
	    
	    //方式3 不用创建对象，直接返回静态内部类的对象
	    Outer10.Inner10 inner10_ = Outer10.getInner10_();
	    System.out.println("**************");
	    inner10_.say();
	}
}
class Outer10{//外部类
	private int n1 = 10;
	private static String name = "张三";
	private static void cry() {
		
	}
	
	//Inner10就是静态内部类
	//1.放在外部类的成员位置
	//2.使用static 修饰
	//3.可以直接访问外部类的所有 静态成员，包含私有的，但不能访问非静态成员
	//4.可以添加任意的访问修饰符(public protected 默认 private)，因为它的地位就是一个成员
	//5.作用域: 同其他成员，是整个类体
	static class Inner10{//内部类
		private static String name = "hspedu~~";
		public void say() {
			System.out.println(name + "外部类name=" + Outer10.name);
			//不能直接访问外部类的非静态成员
			//System.out.println(n1);
			
			cry();
		}	
	}
	
	public void m1() {//外部类访问静态内部类，创建对象，再访问
		Inner10 inner10 = new Inner10();
		inner10.say();
	}
	
	public Inner10 getInner10Instance() {
		return new Inner10();
	}
	
	public static Inner10 getInner10_() {
		return new Inner10();
	}
}