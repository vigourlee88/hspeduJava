package com.hspedu.homework_;

public class Homework05 {
	public static void main(String[] args) {
		new A().f1();
	}
}
class A{
	private String NAME = "hello";
	public void f1() {
		class B{//局部内部类 定义在方法体中
			private final String NAME = "hspedu";;
			public void show() {
				//局部内部类可以直接访问外部类的私有属性
				//内部类和外部类的属性重名时，可以使用 外部类.this.属性名 来指定
				System.out.println("NAME=" + NAME + " 外部类的name="+ A.this.NAME);
			}
	    }
		B b = new B();
		b.show();
	}
	
}