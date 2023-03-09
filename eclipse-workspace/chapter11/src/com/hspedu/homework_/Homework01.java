package com.hspedu.homework_;

public class Homework01 {
	public static void main(String[] args) {
		Car c = new Car();
		//创建对象，
		//1.首先会静态属性初始化 内存中color = "white"
		//2.构造器初始化Car(){},price = 9;color = "red";
		Car c1 = new Car(100);
		//再次创建对象
		//静态部分的代码会随着类的加载而执行
		//1.静态属性不会执行,此时保留color = "red";
		//2.调用有参的构造器price = 100传进来并指向color = "red";
		System.out.println(c);//9.0  red
		System.out.println(c1);//100.0  red
		
	}
}
class Car{
	double price = 10;
	static String color = "white";//静态属性
	public String toString() {
		return price + "\t" + color;
	}
	public Car() {
		this.price = 9;
		this.color = "red";
	}
	public Car(double price) {
		this.price = price;
	}
}