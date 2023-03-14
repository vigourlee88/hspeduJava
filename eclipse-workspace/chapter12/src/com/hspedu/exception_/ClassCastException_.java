package com.hspedu.exception_;

public class ClassCastException_ {
	public static void main(String[] args) {
		A b = new B();//向上转型
		B b2 = (B)b;//向下转型
		C c2 = (C)b;//类型转换异常
	}
}
class A{}
class B extends A{}
class C extends A{}