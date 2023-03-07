package com.hspedu.innerClass_;

import com.hspedu.innerClass_.Outer08.Inner08;

public class MemberInnerClass01 {
	public static void main(String[] args) {
		Outer08 outer08 = new Outer08();
		outer08.t1();
		
		//外部其他类，使用成员内部类的三种方式
		//第一种方式:解读
		//new Inner08();
		//outer08.new Inner08();当做outer08的成员属性使用
		Outer08.Inner08 inner08= outer08.new Inner08();
		inner08.say();
		
		//第二种方式 在外部类中，编写一个方法，可以返回Inner08对象
		Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
		inner08Instance.say();
		
	}
}
class Outer08 {
	private int n1 = 10;
	public String name = "张三";
	
	private void hi() {
		System.out.println("hi()方法...");
	}
	//1.注意: 成员内部类 是定义在外部类的成员位置上
	//2.可以添加任意访问修饰符(public protected 默认 private),
	//因为它的地位就是一个成员
	protected class Inner08{//成员内部类
		private double sal = 99.8;
		private int n1 = 66;
		public void say() {
			//可以直接访问外部类的所有成员，包含私有的
			//如果成员内部类的成员和外部类的成员重名，会遵守就近原则
			//可以通过 外部类名.this.属性 来访问外部类的成员
			System.out.println("n1 = "+ n1
				    +" name=" + name + 
				    " 外部类的n1="+ Outer08.this.n1);
			hi();
		}
	}
	//方法 返回一个Inner08的实例
	public Inner08 getInner08Instance() {
		return new Inner08();
	}
	
	//写方法
	public void t1() {
		//创建成员内部类的对象，然后使用相关方法
		//使用成员内部类
		Inner08 inner08 = new Inner08();
		inner08.say();
		System.out.println(inner08.sal);
	}
}