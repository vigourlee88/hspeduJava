package com.hspedu.interface_;

public class InterfaceExercise02 {
	public static void main(String[] args) {
		new C().pX();
	}
}
interface A_{
	int x = 0;//等价于public static final int x = 0;
}
class B_{
	int x =1;
}
class C extends B_ implements A_{
	public void pX() {
		//System.out.println(x);//错误，不明确x是谁
		//可以明确的指定x
		//访问接口的x就使用A.x
		//访问父类的x就使用super.x
		System.out.println(A_.x + " " + super.x);
	}
}