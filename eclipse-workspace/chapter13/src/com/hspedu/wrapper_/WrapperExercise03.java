package com.hspedu.wrapper_;

public class WrapperExercise03 {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);//false
		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3 == i4);//false
		Integer i5 = 127;//底层赋值Integer.valueOf(1)看源码
		Integer i6 = 127;
		System.out.println(i5 == i6);//true
		Integer i7 = 128;//new
		Integer i8 = 128;//new
		System.out.println(i7 == i8);//false
		Integer i9 = 127;//底层赋值Integer.valueOf(1)new 数组中
		Integer i10 = new Integer(127);
		System.out.println(i9 == i10);//false
		Integer i11 = 127;
		int i12 = 127;
		//只要有基本数据类型，==就是判断值是否相等
		System.out.println(i11 == i12);//true
		Integer i13 = 128;
		int i14 = 128;
		System.out.println(i13 == i14);//true
	}
}
