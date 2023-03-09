package com.hspedu.innerClass_;

public class Test01 {//外部类
	
	public Test01() {//构造器
		//s1指向 堆中的对象 有一个默认值 a =5;
		Inner01 s1 = new Inner01();
		s1.a = 10;//a->10
		//s2指向 堆中一个新对象 有一个默认值 a =5;
		Inner01 s2 = new Inner01();
		System.out.println(s2.a);//5
	}	
	class Inner01{//内部类，成员内部类
		public int a = 5; 
	}
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		//r 指向一个新空间 
		Inner01 r = t.new Inner01();//相当于t调用成员属性
		System.out.println(r.a);//5
	}
}
