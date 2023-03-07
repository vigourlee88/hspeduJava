package com.hspedu.innerClass_;

/**
 * 演示匿名内部类的使用
 *
 */
public class AnonymousInnerClass {
	public static void main(String[] args) {
		Outer04 outer04 = new Outer04();
		outer04.method();
	}
}
class Outer04{//外部类
	
	private int n1 =10;//属性
	public void method() {///方法
		
		//基于接口的匿名内部类
		
		//1.需求: 想使用接口IA,并创建对象
		//2.传统方式，是写一个类，实现该接口，并创建对象
		//3.需求是 Tiger/Dog类只是使用一次，后面再不使用
		//4.可以使用匿名内部类来简化开发
		//5.tiger的编译类型是IA类型
		//6.tiger的运行类型是匿名内部类XXX=> 外部类的名字Outer04$1
		/*
		  我们看底层 会分配Outer04$1
		 class Outer04$1 implements IA{
			@Override
			public void cry() {
				System.out.println("老虎叫唤...");
			}	
		 }
		 */
		//7.jdk底层在创建了匿名类Outer04$1,
		//立即马上就创建了Outer04$1实例
		//并且把地址返回给tiger
		//8.匿名内部类使用一次，就不能再使用，但对象可以反复使用
		IA tiger = new IA() {	
			@Override
			public void cry() {
				System.out.println("老虎叫唤...");
			}	
		};
		System.out.println("tiger的运行类型=" + tiger.getClass());
		tiger.cry();
		tiger.cry();
		tiger.cry();
		
//		IA tiger = new Tiger();
//		tiger.cry();
		
		//演示基于类的匿名内部类
		//分析
		//1.father的编译类型Father
		//2.father的运行类型Outer04$2
		//3.底层会创建匿名内部类,看不到，系统生成的
		/*
		 * 
		  我们看底层 会分配Outer04$2
		  因为类和类的关系
		 class Outer04$2 extends Father{
		 
			}
		 */
		//4.同时也直接返回了 匿名内部类Outer04$2的对象
		//5.注意 ("jack")参数列表会传递给 构造器
		Father father = new Father("jack") {

			@Override
			public void test() {
				System.out.println("匿名内部类重写了test方法");
			}
			
		};
		System.out.println("father对象的运行类型=" + father.getClass());
		father.test();
		
		//基于抽象类的匿名内部类
		//的方法必须实现
		Animal animal = new Animal() {

			@Override
			void eat() {
				System.out.println("小狗吃骨头...");
			}	
		};
		animal.eat();
	}
}
interface IA{//接口
	public void cry();
}

//class Tiger implements IA{
//
//	@Override
//	public void cry() {
//		System.out.println("老虎叫唤...");
//	}	
//}
//class Dog implements IA{
//
//	@Override
//	public void cry() {
//		System.out.println("小狗汪汪叫...");
//	}	
//}
class Father{//类
	public Father(String name) {//构造器
		System.out.println("接收到name=" + name);
	}
	public void test() {//方法
		
	}
}
abstract class Animal{//抽象类
	abstract void eat();
}