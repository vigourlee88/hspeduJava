package com.hspedu.codeblock_;

public class CodeBlockExercise01 {
	public static void main(String[] args) {
		
		// Person.total,会先完成类的加载，再调用
		//total=100 in static block
		System.out.println("total=" + Person.total);
		System.out.println("total=" + Person.total);//total=100
	}
}
class Person{
	public static int total;//静态属性
	static {//静态代码块
		total = 100;
		System.out.println("in static block");
	}
}

	
