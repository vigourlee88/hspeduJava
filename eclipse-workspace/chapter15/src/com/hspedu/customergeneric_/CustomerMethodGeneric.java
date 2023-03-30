package com.hspedu.customergeneric_;

import java.util.ArrayList;

public class CustomerMethodGeneric {
	public static void main(String[] args) {
		Car car = new Car();
		//当调用方法时，传入参数，编译器，就会确定类型
		car.fly("宝马", 100);
		car.fly(300, 100.1);
		Fish<String,ArrayList> fish = new Fish<>();
		//T=> String ,R->ArrayList
		//public<K> void hello(R r,K k) {
		fish.hello(new ArrayList(), 11.3f);
	}
}
//泛型方法 可以定义在普通类中，也可以定义在泛型类中
class Car{
	public void run() {//普通方法		
	}
	//说明
	//1.<T,R>就是泛型
	//2.是提供给fly使用的
	public <T,R> void fly(T t,R r) {//泛型方法
		System.out.println(t.getClass());//String类型
		System.out.println(r.getClass());//泛型是引用类型，100装箱->Integer类型
	}	
}
class Fish<T,R>{//泛型类
	public void run() {
		
	}
	//定义了泛型方法，就要去使用
	public <U,M> void eat(U u,M m) {
		
	}
	//说明
	//1.下面的hi方法不是泛型方法
	//2.是hi方法使用了类声明的 泛型
	public void hi(T t) {
		
	}
	//泛型方法 可以使用类声明的泛型，也可以使用自己声明的泛型
	public<K> void hello(R r,K k) {
		System.out.println(r.getClass());
		System.out.println(k.getClass());
	}
}