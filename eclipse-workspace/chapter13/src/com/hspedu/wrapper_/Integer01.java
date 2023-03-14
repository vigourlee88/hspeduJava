package com.hspedu.wrapper_;

public class Integer01 {
	public static void main(String[] args) {
		//int->Integer 的装箱和拆箱
		//jdk5前是手动 装箱和拆箱
		//手动装箱
		int n1 = 100;
		Integer integer = new Integer(n1);
		Integer integer1 = Integer.valueOf(n1);
		
		//jdk5以后，就可以自动装箱和拆箱
		int n2 = 200;
		//自动装箱前 int-> Integer
		Integer integer2 = n2;//底层使用的是Integer.valueOf(n2
		//自动拆箱 Integer -> int
		int n3 = integer2;
		
	}
}
