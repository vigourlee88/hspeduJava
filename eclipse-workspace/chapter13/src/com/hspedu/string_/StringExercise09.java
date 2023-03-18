package com.hspedu.string_;

public class StringExercise09 {
	public static void main(String[] args) {
		
		String s1 = "hspedu";//s1指向池中"hspedu"
		String s2 = "java";//s2指向池中"java"
		String s5 = "hspedujava";//s5指向池中"hspedujava"
		String s6 = (s1 + s2).intern();//s6指向池中 内容的常量"hspedujava"
		System.out.println(s5 == s6);//内容一样 T
		System.out.println(s5.equals(s6));//T
	}
}
