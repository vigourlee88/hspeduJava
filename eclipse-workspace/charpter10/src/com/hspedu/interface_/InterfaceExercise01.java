package com.hspedu.interface_;

public class InterfaceExercise01 {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);// 23 对象实例访问a可以，a是静态的
		System.out.println(AAAA.a);//23
		System.out.println(B.a);//23
	}
}
interface AAAA{
	int a = 23;//等价于public static final int a = 23;
}
class B implements AAAA{//B类实现了接口A,就可以使用A中属性和方法
	
}