package com.hspedu.string_;

public class StringExercise07 {
	public static void main(String[] args) {
		//编译器会优化，等价于String a ="helloabc"
		//创建只有一个对象
//		String a = "hello " + "abc";//等号右边是常量值
		
		//1.先创建一个StringBuilder sb = StringBuilder();
		//2.执行 sb.append("hello");
		//3.sb.append("abc");
		//4.String s = sb.toString()
		//其实是d指向堆中的对象(String) value[]->池中"helloabc"
		String b = "hello";//创建b对象
		String c = "abc";//创建c对象
		String d = b + c;//d指向堆中的value值，变量相加是在堆中
		String e = "helloabc";//e直接指向池中"helloabc"
		System.out.println(d == e);//false
		String f = "hello" + "abc";//直接看池，e指向常量池
		System.out.println(f == e);//true
	}
}
