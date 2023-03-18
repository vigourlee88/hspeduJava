package com.hspedu.string_;

public class StringExercise03 {
	public static void main(String[] args) {
		
		/*
		 * 创建String对象的两种形式
		 * 1.直接赋值
		 * 先从常量池查看是否有"hsp"数据空间，
		 * 如果有，就直接指向，
		 * 如果没有则重新创建，然后指向
		 * 最终指向常量池的空间地址
		 * 2.调用构造器
		 * 先在堆中创建空间，里面维护了value属性，指向常量池的hsp空间
		 * 如果常量池中没有"hsp",重新创建，
		 * 如果有，直接通过value指向
		 * 最终指向堆中的空间地址
		 */
		String a = "hsp";//a指向常量池的hsp
		String b = new String("hsp");//b指向堆中的对象
		
		System.out.println(a.equals(b));//比较内容 true
		System.out.println(a == b);//指向的对象不一样 false
		/*
		 * 当调用intern方法时，如果池已经包含此String对象的字符串
		 * 则返回来自池的字符串
		 * 否则，此String对象将添加到池中，并返回对此String对象的引用
		 * 这个方法最终返回的是常量池的地址(对象)
		 */
		System.out.println(a == b.intern());//true
		//b指向堆中的对象，b.intern()指向常量池的地址
		System.out.println(b == b.intern());//false
	}
}
