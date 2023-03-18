package com.hspedu.string_;

public class StringExercise01 {
	public static void main(String[] args) {
		
		String a = "abc";//底层String.valueOf("abc")
		String b = "abc";
		//重写了equals方法，比较两个对象的内容
		System.out.println(a.equals(b));//true
		//== 比较两个对象的地址值
		System.out.println(a == b);//true
	}
}
